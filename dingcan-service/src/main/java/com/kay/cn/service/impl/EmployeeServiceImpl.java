package com.kay.cn.service.impl;

import com.kay.cn.manager.employee.EmployeeSearch;
import com.kay.cn.service.EmployeeService;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Service 层
 *
 * @author kay
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeSearch employeeSearch;

    @Override
    public List<EmployeeSearchVo> search(String keyword) {
        return employeeSearch.search(keyword);
    }
}
