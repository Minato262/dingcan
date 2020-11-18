package com.kay.cn.service;

import com.kay.cn.NestedRuntimeException;

public class ServiceRuntimeException extends NestedRuntimeException {

    public ServiceRuntimeException() {
        super();
    }

    public ServiceRuntimeException(String message) {
        super(message);
    }

    public ServiceRuntimeException(Throwable cause) {
        super(cause);
    }
}
