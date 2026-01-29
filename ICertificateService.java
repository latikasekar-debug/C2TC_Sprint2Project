package com.placement.service;

import java.util.List;

import com.placement.model.Certificate;

public interface ICertificateService {

    // Add a new certificate
    Certificate addCertificate(Certificate certificate);

    // Update an existing certificate
    Certificate updateCertificate(Certificate certificate);

    // Search certificate by ID
    Certificate searchCertificate(Long id);

    // Delete certificate by ID
    void deleteCertificate(Long id);
 
    //Lists all the certificates
    List<Certificate> getAllCertificates();
}