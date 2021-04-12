package com.nikitalesnikov.springbootrest.spring.exception_handing;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalException {
    @ExceptionHandler
    public ResponseEntity<EmpExcept> handleException(
            NoSuchEmployeeExcept exception){
        EmpExcept data = new EmpExcept();
        data.setInfo(exception.getMessage());
        return  new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<EmpExcept> handleException(
            Exception exception){
        EmpExcept data = new EmpExcept();
        data.setInfo(exception.getMessage());
        return  new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
