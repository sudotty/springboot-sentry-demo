package com.ipkaq.springbootsentry.demo;

public class ComputeExcetption extends RuntimeException {
    public ComputeExcetption() {
    }

    public ComputeExcetption(String message) {
        super(message);
    }

    public ComputeExcetption(String message, Throwable cause) {
        super(message, cause);
    }

    public ComputeExcetption(Throwable cause) {
        super(cause);
    }

    public ComputeExcetption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
