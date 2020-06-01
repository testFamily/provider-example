package com.example.testing.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Service
@RefreshScope
public class HelloServiceImpl implements HelloService {

    @Value("${local.name}")
    private String name;

    @Override
    public String hello() {
        System.out.println(name);
        return "hello " + name;
    }
    
}
