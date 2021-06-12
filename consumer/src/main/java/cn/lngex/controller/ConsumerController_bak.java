package cn.lngex.controller;

import cn.lngex.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/c")
public class ConsumerController_bak {

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
     * 接收请求
     * 获取服务列表
     * 调用生产者服务响应到页面
     * @param id
     * @return User
     * @author 廖某人
     */
   /* @RequestMapping("/c/{id}")
    public User getUser(@PathVariable("id") Long id){
        *//* 获取服务USERPROVIDES列表 *//*
        // List<ServiceInstance> userprovides = discoveryClient.getInstances("USERPROVIDES");
        *//* 获取uri *//*
        // URI uri = userprovides.get(1).getUri();
        *//* 拼接url *//*
        // String url = uri+"/p/p/"+id;

        *//* 直接使用服务名获取列表 *//*
        String url = "http://USERPROVIDES/p/p/"+id;

        *//* 调用生产者接口获取对象 *//*
        return restTemplate.getForObject(url, User.class);
    }*/
}
