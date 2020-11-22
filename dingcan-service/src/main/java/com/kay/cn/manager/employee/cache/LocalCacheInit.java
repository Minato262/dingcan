package com.kay.cn.manager.employee.cache;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;

@Component
public class LocalCacheInit {

    @Resource
    private ExecutorService cacheExecutorService;

    @PostConstruct
    private void init() {
        cacheExecutorService.execute(new LocalCacheInitThread());
    }
}
