package com.kay.cn.util;

import com.kay.cn.constract.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;

import static com.kay.cn.constract.ResultCodeEnum.*;

/**
 * result 返回
 *
 * @author kay
 */
@Data
public final class Result implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;

    private final int code;
    private final String message;
    private final Object data;

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result success(Object data) {
        return new Result(SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    public static Result failed(ResultCodeEnum codeEnum) {
        return new Result(codeEnum.getCode(), codeEnum.getMessage(), null);
    }

    public static Result paramsError(String message) {
        return new Result(PARAM_ERROR.getCode(), message, null);
    }

    public static Result systemError(String message) {
        return new Result(SYSTEM_ERROR.getCode(), message, null);
    }
}
