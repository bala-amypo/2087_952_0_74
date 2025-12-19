package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?>hello(MethodArgumentNotValidException ex){
       Map<String,String> map=new HashMap<>();
       ex.getBindingResult().getFieldError().forEach(error -> map.put(error.getField(),error.getDefaultMessage()));
       return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(PasswordNotMatchCri.class)
   public String hi(){
       return "Hi";
   }
}










