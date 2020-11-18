package com.kay.cn.manager.employee.load;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;

@Component
public class EmployeeLocalCacheInit {

    @Resource
    private ExecutorService cacheExecutorService;

    @PostConstruct
    private void init() {
        cacheExecutorService.execute(new EmployeeLocalCacheInitThread());
    }
}
