package com.kay.cn.manager.employee;

import com.kay.cn.vo.EmployeeSearchVo;

import java.util.List;

public interface EmployeeSearch {

    List<EmployeeSearchVo> search(String keyword);
}
