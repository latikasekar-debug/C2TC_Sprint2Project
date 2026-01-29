package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.placement.model.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}