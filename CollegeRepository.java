package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.placement.model.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
}