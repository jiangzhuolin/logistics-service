package com.jiangzhuolin.logisticsservice.controller;

import com.jiangzhuolin.logisticsservice.service.ILogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/logistics/")
public class LogisticsController {

    @Autowired
    private ILogisticsService logisticsService;

    @RequestMapping(value = "/message")
    public String message(long userId) {
        String response = logisticsService.getUserInfo(userId);
        return response;
    }
}
