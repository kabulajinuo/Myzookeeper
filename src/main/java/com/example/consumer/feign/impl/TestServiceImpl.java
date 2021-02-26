package com.example.consumer.feign.impl;

import com.example.consumer.feign.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "服务器异常！！！";
    }
}
