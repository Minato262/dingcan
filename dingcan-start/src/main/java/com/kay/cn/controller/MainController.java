package com.kay.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dingcan")
public class MainController {

    @RequestMapping("/home.html")
    public String home() {
        return "home";
    }
}
