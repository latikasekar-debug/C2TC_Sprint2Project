package com.placement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.placement.model.Certificate;
import com.placement.repository.CertificateRepository;
import com.placement.service.ICertificateService;

@Service
public class CertificateServiceImpl implements ICertificateService {

    @Autowired
    private CertificateRepository certificateRepo;

    @Override
    public Certificate addCertificate(Certificate certificate) {
        return certificateRepo.save(certificate);
    }

    @Override
    public Certificate updateCertificate(Certificate certificate) {
        return certificateRepo.save(certificate);
    }

    @Override
    public Certificate searchCertificate(Long id) {
        return certificateRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteCertificate(Long id) {
        certificateRepo.deleteById(id);
    }
}