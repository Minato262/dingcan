package com.kay.cn.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeSearchVo implements Serializable {

    private Long employeeId;

    private String employeeRealName;

    private String employeeJobCode;

    public EmployeeSearchVo() {
        //
    }

    public EmployeeSearchVo(Long employeeId,
                            String employeeRealName,
                            String employeeJobCode) {
        this.employeeId = employeeId;
        this.employeeRealName = employeeRealName;
        this.employeeJobCode = employeeJobCode;
    }
}
