package cn.lngex.config;


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
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
