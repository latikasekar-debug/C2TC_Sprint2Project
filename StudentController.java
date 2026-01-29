package com.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.placement.model.Student;
import com.placement.repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentRepo.deleteById(id);
        return "Student deleted";
    }
}