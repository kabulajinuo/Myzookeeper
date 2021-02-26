package com.example.consumer.feign;

import com.example.consumer.feign.impl.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "zk-producer", fallback = TestServiceImpl.class)
public interface TestService {

    @GetMapping("testController/test")
    public String test();
}
