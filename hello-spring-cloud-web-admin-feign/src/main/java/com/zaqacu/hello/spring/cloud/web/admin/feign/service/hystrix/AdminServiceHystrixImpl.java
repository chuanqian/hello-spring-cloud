package com.zaqacu.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.zaqacu.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrixImpl implements AdminService {

    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is : %s , but reqeust bad.",message);
    }
}
