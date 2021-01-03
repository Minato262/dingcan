package com.kay.cn;

public abstract class NestedRuntimeException extends RuntimeException {

    protected NestedRuntimeException() {
        super();
    }

    protected NestedRuntimeException(String message) {
        super(message);
    }

    protected NestedRuntimeException(Throwable cause) {
        super(cause);
    }
}
