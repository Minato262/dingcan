package com.kay.cn.manager.employee.cache;

import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class LocalCacheInitThread implements Runnable {

    private static final EmployeeLocalCache CACHE_INSTANCE = EmployeeLocalCache.INSTANCE;

    @Override
    public void run() {
        log.info("local cache, start!");
        Map<String, EmployeeSearchVo> map = new LocalEmployeeResource().getContent();
        CACHE_INSTANCE.initCache(map);
        log.info("local cache, end! success={}", map.size());
    }
}
