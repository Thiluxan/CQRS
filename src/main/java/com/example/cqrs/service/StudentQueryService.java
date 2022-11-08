package com.example.cqrs.service;

import com.example.cqrs.model.Student;
import com.example.cqrs.repo.StudentQueryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentQueryService {

    @Autowired
    StudentQueryRepo studentQueryRepo;

    public List<Student> getAllStudents(){
        return studentQueryRepo.findAll();
    }

    public Student getStudentById(int id){
        return studentQueryRepo.findById(id).get();
    }
}
