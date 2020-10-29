package com.kay.cn.service.impl;

import com.kay.cn.exection.BaseRuntimeException;

public class ServiceRuntimeException extends BaseRuntimeException {

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
