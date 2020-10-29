package com.kay.cn.manager.impl;

import com.kay.cn.manager.HomeTwoManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * One Manager
 *
 * @author kay
 */
@Slf4j
@Service(value = "twoManager")
public class HomeTwoManagerImpl implements HomeTwoManager {

    @Override
    public void test() {
        log.info("HomeTwoManger test().");
    }
}
