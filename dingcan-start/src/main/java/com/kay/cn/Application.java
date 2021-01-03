package com.kay.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类
 *
 * @author kay
 * @version v1.0
 */
@SpringBootApplication(scanBasePackages = "com.kay.cn")
@MapperScan("com.kay.cn.tddl.mybatis")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
