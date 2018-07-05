package com.jiangzhuolin.logisticsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/logistics/")
public class LogisticsController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/message")
    public String message(String userId) {
        String response = restTemplate.getForObject("http://USER-SERVICE/user/{userId}", String.class, userId);
        return response;
    }
}
