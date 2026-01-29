package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.placement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}