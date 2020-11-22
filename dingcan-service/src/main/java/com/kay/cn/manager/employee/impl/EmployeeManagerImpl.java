package com.kay.cn.manager.employee.impl;

import com.kay.cn.manager.employee.EmployeeManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * One Manager
 *
 * @author kay
 */
@Slf4j
@Service(value = "twoManager")
public class EmployeeManagerImpl implements EmployeeManager {

    @Override
    public void test() {
        log.info("HomeTwoManger test().");
    }
}
