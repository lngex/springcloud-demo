package cn.lngex.controller;

import cn.lngex.domain.User;
import cn.lngex.feignclient.IFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/c")
public class ConsumerController {

    /**
     * 用于发起http请求
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 用于获取注册中心的通讯列表
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 代理实现
     */
    @Autowired
    private IFeignClient feignClient;

    /**
     * 接收请求
     * 获取服务列表
     * 调用生产者服务响应到页面
     * @param id
     * @return User
     * @author 廖某人
     */
    @RequestMapping("/c/{id}")
    public User getUser(@PathVariable("id") Long id){
        return feignClient.getUser(id);
    }
}
