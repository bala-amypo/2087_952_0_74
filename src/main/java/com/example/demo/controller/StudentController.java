package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired 
    StudentService stdser;
    @postMapping("/addStudent")
    public Student addStudent(@RestController Student st){
        return stdser.poststudent(st);
    }
}



