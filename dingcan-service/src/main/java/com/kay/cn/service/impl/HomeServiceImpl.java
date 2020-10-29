package com.kay.cn.service.impl;

import com.kay.cn.manager.HomeOneManager;
import com.kay.cn.manager.HomeTwoManager;
import com.kay.cn.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Service 层
 */
@Slf4j
@Service
public class HomeServiceImpl implements HomeService {

    @Resource
    private HomeOneManager oneManager;

    @Resource
    private HomeTwoManager twoManager;

    @Override
    public void test() {
        oneManager.test();
        twoManager.test();
    }
}
