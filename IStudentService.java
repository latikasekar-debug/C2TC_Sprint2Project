package com.placement.service;

import com.placement.model.Student;
import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    Student getStudent(Long id);
    List<Student> getAllStudents();
    void deleteStudent(Long id);
}