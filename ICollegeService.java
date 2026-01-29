package com.placement.service;

import com.placement.model.College;
import java.util.List;

public interface ICollegeService {
    College addCollege(College college);
    College updateCollege(College college);
    College getCollege(Long id);
    List<College> getAllColleges();
    void deleteCollege(Long id);
}