package com.mjc.stage2.impl;

public class IllegalConnectionException extends RuntimeException {
    IllegalConnectionException(String message) {
        super(message);
    }

    IllegalConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
