package com.kay.cn;

import com.kay.cn.constract.ResultCodeEnum;

import static com.kay.cn.constract.ResultCodeEnum.*;

/**
 * 业务异常
 *
 * @author kay
 */
public class ServiceRuntimeException extends NestedRuntimeException {

    private final ResultCodeEnum codeEnum;

    public ServiceRuntimeException(ResultCodeEnum codeEnum) {
        this.codeEnum = codeEnum;
    }

    public ServiceRuntimeException(Throwable cause) {
        super(cause);
        this.codeEnum = SYSTEM_ERROR;
    }

    public ResultCodeEnum getCodeEnum() {
        return this.codeEnum;
    }
}
