package com.example.demo.exception;

import org.springframework.web.bind.annotation.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String hello(){
    return "hello";
}

@