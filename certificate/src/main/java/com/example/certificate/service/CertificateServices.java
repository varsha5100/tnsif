package com.example.certificate.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.certificate.entity.Certificate;
import com.example.certificate.repository.CertificateRepository;

@Service
public class CertificateServices {

    @Autowired
    private CertificateRepository repository;

    // Create
    public Certificate addCertificate(Certificate certificate) {
        return repository.save(certificate);
    }

    // Read All
    public List<Certificate> getAllCertificates() {
        return repository.findAll();
    }

    // Read by ID
    public Optional<Certificate> getCertificateById(Long id) {
        return repository.findById(id);
    }

    // Update
    public Certificate updateCertificate(Long id, Certificate updatedCertificate) {
        return repository.findById(id).map(certificate -> {
            certificate.setYear(updatedCertificate.getYear());
            return repository.save(certificate);
        }).orElseThrow(() -> new RuntimeException("Certificate not found with id " + id));
    }

    // Delete
    public String deleteCertificate(Long id) {
        repository.deleteById(id);
        return "Certificate deleted with id " + id;
    }
}