package com.example.cqrs.controller;

import com.example.cqrs.model.Student;
import com.example.cqrs.service.StudentQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentQueryController {

    @Autowired
    StudentQueryService studentQueryService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentQueryService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return studentQueryService.getStudentById(id);
    }
}
