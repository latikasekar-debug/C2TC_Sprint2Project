package com.placement.service.impl;

import com.placement.model.College;
import com.placement.repository.CollegeRepository;
import com.placement.service.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements ICollegeService {

    @Autowired
    private CollegeRepository collegeRepo;

    @Override
    public College addCollege(College college) {
        return collegeRepo.save(college);
    }

    @Override
    public College updateCollege(College college) {
        return collegeRepo.save(college);
    }

    @Override
    public College getCollege(Long id) {
        return collegeRepo.findById(id).orElse(null);
    }

    @Override
    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    @Override
    public void deleteCollege(Long id) {
        collegeRepo.deleteById(id);
    }
}