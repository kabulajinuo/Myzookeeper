package com.example.consumer.controller;

import com.example.consumer.feign.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cTestController")
@Api(value = "/cTestController", tags = {"测试zookeeper"})
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiOperation(value = "测试", notes = "登录", httpMethod = "GET")
    public String test(){
        return testService.test();
    }
}
