package com.kay.cn.manager.impl;

import com.kay.cn.manager.HomeOneManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * One Manager 层
 *
 * @author kay
 */
@Slf4j
@Service(value = "oneManager")
public class HomeOneManagerImpl implements HomeOneManager {

    @Override
    public void test() {
        log.info("HomeOneManger test().");
    }
}
