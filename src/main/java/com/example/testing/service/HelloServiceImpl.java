package com.example.testing.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    
    @Override
    public String hello(String name) {
        System.out.println(name);
        return "hello " + name;
    }
    
}
