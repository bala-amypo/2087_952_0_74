package com.example.demo.exception;

public class PatternNotMatchCri extends RuntimeException{
    public PasswordNotMatchCri(String msg){
        super(msg);
    }
}

if(pass.length()<8){
    throw new PasswordNotMatchCri("Password should have 8 char");
}