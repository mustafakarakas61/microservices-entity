package com.mustafa.product_ms.exception;

public class ProductRuntimeException extends RuntimeException {
    public ProductRuntimeException(String message) {
        super(message);
    }

    public ProductRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
