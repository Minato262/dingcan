package com.kay.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类
 *
 * @author kay
 * @version v1.0
 */
@SpringBootApplication(scanBasePackages = "com.kay.cn")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
