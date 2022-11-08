package com.example.cqrs.repo;

import com.example.cqrs.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentCommandRepo extends JpaRepository<Student, Integer> {

    void deleteById(int id);
}
