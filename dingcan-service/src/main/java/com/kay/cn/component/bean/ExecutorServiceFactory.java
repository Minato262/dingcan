package com.kay.cn.component.bean;

import com.kay.cn.util.NamedThreadFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class ExecutorServiceFactory {

    private static final int MAX_LIMIT = 40000;

    @Bean("cacheExecutorService")
    public ExecutorService createCacheExecutorService() {
        return new ThreadPoolExecutor(1,
                                    1,
                                    0,
                                    TimeUnit.SECONDS,
                                    new ArrayBlockingQueue<>(MAX_LIMIT),
                                    new NamedThreadFactory("CacheFactory"));
    }
}
