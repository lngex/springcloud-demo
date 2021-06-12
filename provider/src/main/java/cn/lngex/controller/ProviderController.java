package cn.lngex.controller;

import cn.lngex.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
public class ProviderController {

    @RequestMapping("/p/{id}")
    public User getUser(@PathVariable("id") Long id){
        // int i = 1/0;
        return new User(id,"身长这"+id);
    }
}
