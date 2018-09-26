package com.xwtech.springcloud.order.controller;

import com.xwtech.springcloud.order.feign.MemberFeign;
import com.xwtech.springcloud.order.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private MemberFeign memberFeign;
    @GetMapping("/getUserFromMember/{id}")
    public  User getUserFromMember(@PathVariable("id") Long id ){
        User user = memberFeign.getUserById(id);
        return user;
    }
}
