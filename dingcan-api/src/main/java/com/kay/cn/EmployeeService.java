package com.kay.cn;

import com.kay.cn.vo.EmployeeSearchVo;

import java.util.List;

public interface EmployeeService {

    List<EmployeeSearchVo> search(String keyword);
}
