package com.kay.cn.constract;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "success"),

    EMPLOYEE_LOAD_CACHE_FAIL(160000, "员工信息载入失败"),

    PARAM_ERROR(-2, "参数错误"),
    SYSTEM_ERROR(-1, "系统错误");

    private final int code;
    private final String message;

    ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
