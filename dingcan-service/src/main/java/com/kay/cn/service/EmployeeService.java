package com.kay.cn.service;

import com.kay.cn.vo.EmployeeSearchVo;

import java.util.List;

public interface EmployeeService {

    void list();

    List<EmployeeSearchVo> search(String keyword);
}
