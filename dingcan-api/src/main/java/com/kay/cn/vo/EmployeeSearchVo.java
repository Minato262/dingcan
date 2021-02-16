package com.kay.cn.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeSearchVo implements Serializable {

    private String employeeJobCode;

    private String employeeRealName;

    public EmployeeSearchVo(String employeeJobCode,
                            String employeeRealName) {
        this.employeeJobCode = employeeJobCode;
        this.employeeRealName = employeeRealName;
    }

    public boolean contains(String keyword) {
        return employeeRealName.contains(keyword) || employeeJobCode.contains(keyword);
    }
}
