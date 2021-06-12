package cn.lngex.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 *
 */
@Configuration
public class EurekaConfig {
    /**
     * 将RestTemplate交给容器管理
     * @return
     */
    @Bean
    /* 使用负载均衡 */
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    /**
     * 自定义负载均衡策略
     * @return IRule
     */
    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
