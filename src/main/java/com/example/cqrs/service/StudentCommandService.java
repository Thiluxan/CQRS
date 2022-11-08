package com.example.cqrs.service;

import com.example.cqrs.model.Student;
import com.example.cqrs.repo.StudentCommandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCommandService {

    @Autowired
    StudentCommandRepo studentCommandRepo;

    public Student addStudent(Student student){
        return studentCommandRepo.save(student);
    }

    public void deleteStudentById(int id){
        studentCommandRepo.deleteById(id);
    }

    public Student updateStudent(int id, Student student){
        student.setId(id);
        return studentCommandRepo.save(student);
    }
}
