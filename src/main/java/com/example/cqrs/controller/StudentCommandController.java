package com.example.cqrs.controller;

import com.example.cqrs.model.Student;
import com.example.cqrs.service.StudentCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentCommandController {

    @Autowired
    StudentCommandService studentCommandService;

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentCommandService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student){
        return studentCommandService.updateStudent(id,student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable("id") int id){
        studentCommandService.deleteStudentById(id);
    }
}
