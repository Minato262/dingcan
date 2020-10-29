package com.kay.cn.exection;

public abstract class BaseRuntimeException extends RuntimeException {

    public BaseRuntimeException() {
        super();
    }

    public BaseRuntimeException(String message) {
        super(message);
    }

    public BaseRuntimeException(Throwable cause) {
        super(cause);
    }
}
