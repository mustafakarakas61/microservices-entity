package com.mustafa.order_ms.exception;

public class OrderRuntimeException extends RuntimeException {
    public OrderRuntimeException(String message) {
        super(message);
    }

    public OrderRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
