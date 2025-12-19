package com.example.demo.exception;

public class PasswordNotMatchCri extends RuntimeException{
    public PasswordNotMatchCri(String msg){
        super(msg);
    }
}
