package com.kay.cn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 安全检测
 *
 * @author kay
 */
@Controller
@RequestMapping("/dingcan")
public class MainController {

    @GetMapping("/home/index.html")
    public String home() {
        return "home/index";
    }

    @GetMapping("/admin/index.html")
    public String admin() {
        return "admin/index";
    }
}
