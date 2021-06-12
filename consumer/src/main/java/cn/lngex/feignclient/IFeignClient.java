package cn.lngex.feignclient;


import cn.lngex.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.openfeign.FeignClient;


/**
 * feign接口
 * 调用USERPROVIDES服务
 */
@FeignClient(value = "USERPROVIDES",fallbackFactory = FallbackFactorys.class)
public interface IFeignClient {

    /**
     * 调用接口
     * @param id
     * @return
     */
    @RequestMapping("/p/p/{id}")
    User getUser(@PathVariable("id") Long id);
}
