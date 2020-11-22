package com.kay.cn.service.impl;

import com.kay.cn.manager.EmployeeManager;
import com.kay.cn.manager.employee.EmployeeSearch;
import com.kay.cn.service.EmployeeService;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Service 层
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeManager employeeManager;

    @Resource
    private EmployeeSearch employeeSearch;

    @Override
    public void list() {
        employeeManager.test();
    }

    @Override
    public List<EmployeeSearchVo> search(String keyword) {
        return employeeSearch.search(keyword);
    }
}
