package com.kay.cn.controller;

import com.kay.cn.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Controller 层
 *
 * @author kay
 */
@RestController
public class HomeController {

    @Resource
    private HomeService homeService;

    @GetMapping("/greeting")
    public String index() {
        homeService.test();
        return "Hello";
    }
}
