package com.kay.cn.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EmployeeSearchVo implements Serializable {

    private String employeeJobCode;

    private String employeeRealName;

    public EmployeeSearchVo(String employeeJobCode,
                            String employeeRealName) {
        this.employeeJobCode = employeeJobCode;
        this.employeeRealName = employeeRealName;
    }

    @Override
    public String toString() {
        return employeeJobCode + " " + employeeRealName;
    }
}
