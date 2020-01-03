package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class demoServiceImpl implements DemoSerivce {
    @Override
    public String a(String name) {
        return name+"，真帅！！！";
    }
}
