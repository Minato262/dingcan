package com.kay.cn.util;

import lombok.Data;

import java.io.Serializable;

@Data
public final class Result implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;

    private final String code;
    private final String message;
    private final Object data;

    public Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result success(Object data) {
        return new Result("200", "", data);
    }

    public static Result failed(String message) {
        return new Result("", message, null);
    }
}
