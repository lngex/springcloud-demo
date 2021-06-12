package cn.lngex.feignclient;

import cn.lngex.domain.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackFactorys implements FallbackFactory<IFeignClient> {
    @Override
    public IFeignClient create(Throwable throwable) {
        return new IFeignClient() {
            @Override
            public User getUser(Long id) {
                return new User(-1L,"系统异常");
            }
        };
    }
}
