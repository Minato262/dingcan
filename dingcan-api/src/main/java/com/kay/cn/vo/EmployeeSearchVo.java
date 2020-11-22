package com.kay.cn.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class EmployeeSearchVo implements Serializable {

    private String employeeJobCode;

    private String employeeRealName;

    public EmployeeSearchVo() {
        //
    }

    public EmployeeSearchVo(String employeeJobCode,
                            String employeeRealName) {
        this.employeeJobCode = employeeJobCode;
        this.employeeRealName = employeeRealName;
    }
}
