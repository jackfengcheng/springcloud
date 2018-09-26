package com.xwtech.springcloud.member.controller;

import com.xwtech.springcloud.member.service.UserService;
import com.xwtech.springcloud.member.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id ){
        User user = userService.getUserById(id);
        return  user;
    }
}
