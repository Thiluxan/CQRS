package com.example.cqrs.repo;

import com.example.cqrs.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentQueryRepo extends JpaRepository<Student, Integer> {
}
