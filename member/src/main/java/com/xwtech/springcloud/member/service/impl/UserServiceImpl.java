package com.xwtech.springcloud.member.service.impl;

import com.xwtech.springcloud.member.service.UserService;
import com.xwtech.springcloud.member.vo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setId(123456L);
        user.setName("张三");
        user.setAddress("兰州市北滨和西路666号");
        return user;
    }
}
