package com.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.placement.model.College;
import com.placement.repository.CollegeRepository;

@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private CollegeRepository collegeRepo;

    @PostMapping("/add")
    public College addCollege(@RequestBody College college) {
        return collegeRepo.save(college);
    }

    @GetMapping("/{id}")
    public College getCollege(@PathVariable Long id) {
        return collegeRepo.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    @PutMapping("/update")
    public College updateCollege(@RequestBody College college) {
        return collegeRepo.save(college);
    }

    @DeleteMapping("/{id}")
    public String deleteCollege(@PathVariable Long id) {
        collegeRepo.deleteById(id);
        return "College deleted";
    }
}