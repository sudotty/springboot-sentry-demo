package com.ipkaq.springbootsentry.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ipkaq
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    HelloService helloService;
    @GetMapping
    public String hello() throws InterruptedException {
        return helloService.hello();
    }
}
