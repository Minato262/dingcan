package com.kay.cn;

public abstract class NestedRuntimeException extends RuntimeException {

    public NestedRuntimeException() {
        super();
    }

    public NestedRuntimeException(String message) {
        super(message);
    }

    public NestedRuntimeException(Throwable cause) {
        super(cause);
    }
}
