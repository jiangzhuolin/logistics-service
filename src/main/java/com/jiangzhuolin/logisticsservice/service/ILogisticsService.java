package com.jiangzhuolin.logisticsservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service")
public interface ILogisticsService {
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, consumes = "application/json")
    String getUserInfo(@PathVariable(value = "id") long id);
}
