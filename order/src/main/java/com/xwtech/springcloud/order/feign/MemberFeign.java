package com.xwtech.springcloud.order.feign;

import com.xwtech.springcloud.order.fallback.MemberFeginFallback;
import com.xwtech.springcloud.order.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "service-member",fallback = MemberFeginFallback.class)
public interface MemberFeign {
    @RequestMapping(value = "/user/{id}")
    User getUserById(@PathVariable("id") Long id );
}
