package com.github.controller;

import com.github.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * Created by leolin on 7/9/2018.
 */
@RestController
public class HelleController {
//    @Autowired
//    private RestTemplate restTemplate;

    @Resource
    private HelloService helloService;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String hello() {
//        return restTemplate.getForEntity("http://SERVICE-HELLO/hello", String.class).getBody();
//    }

//    @Value("${server.port}")
//    private int serverPort = 0;
//
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        String response = helloService.sayHiFromClientOne("hello");
        return response;
    }

}
