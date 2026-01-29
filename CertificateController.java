package com.placement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.placement.model.Certificate;
import com.placement.service.ICertificateService;

@RestController
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private ICertificateService certificateService;

    // Add a new certificate
    @PostMapping("/add")
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return certificateService.addCertificate(certificate);
    }

    // Get certificate by ID
    @GetMapping("/{id}")
    public Certificate getCertificate(@PathVariable Long id) {
        return certificateService.searchCertificate(id);
    }
    
    // Get all certificates
    @GetMapping
    public ResponseEntity<List<Certificate>> getAllCertificates() {
        return ResponseEntity.ok(certificateService.getAllCertificates());
    }


    // Update certificate
    @PutMapping("/update")
    public Certificate updateCertificate(@RequestBody Certificate certificate) {
        return certificateService.updateCertificate(certificate);
    }

    // Delete certificate
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCertificate(@PathVariable Long id) {
        certificateService.deleteCertificate(id);
        return ResponseEntity.ok("Certificate deleted successfully");
    }
}