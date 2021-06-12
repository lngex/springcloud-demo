package cn.lngex.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * 登录过滤器器
 */
@Component
public class LoginFilter extends ZuulFilter {

    /**
     * pre 前置拦截器
     * @return pre
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 优先级，数字越小优先级越高
     * @return 1
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 开启请求
     * @return true
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 业务逻辑
     * @return null
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        try {
            /* 获取请求上下文 */
            RequestContext context = RequestContext.getCurrentContext();
            /* 获取请求参数 */
            HttpServletRequest request = context.getRequest();
            /* 获取token */
            String token = request.getHeader("token");
            /* 判断token是否存在 */
            if(!StringUtils.isNotBlank(token)){
                /* 设置响应失败 */
                context.setSendZuulResponse(false);
                context.setResponseStatusCode(401);
            }
        }catch (Exception e){}
        return null;
    }
}
