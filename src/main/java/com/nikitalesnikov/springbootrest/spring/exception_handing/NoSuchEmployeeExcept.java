package com.nikitalesnikov.springbootrest.spring.exception_handing;

public class NoSuchEmployeeExcept extends RuntimeException {
    public NoSuchEmployeeExcept(String message) {
        super(message);
    }
}
