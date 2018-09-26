package com.xwtech.springcloud.order.fallback;

import com.xwtech.springcloud.order.feign.MemberFeign;
import com.xwtech.springcloud.order.vo.User;
import org.springframework.stereotype.Component;

@Component
public class MemberFeginFallback implements MemberFeign {
    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setId(000000L);
        user.setName("五姓名");
        user.setAddress("流浪汉");
        return user;
    }
}
