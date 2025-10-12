package com.example.certificate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.certificate.entity.Certificate;
import com.example.certificate.service.CertificateServices;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private CertificateServices service;

    // Create
    @PostMapping
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return service.addCertificate(certificate);
    }

    // Read All
    @GetMapping
    public List<Certificate> getAllCertificates() {
        return service.getAllCertificates();
    }

    // Read by ID
    @GetMapping("/{id}")
    public ResponseEntity<Certificate> getCertificateById(@PathVariable Long id) {
        return service.getCertificateById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Certificate> updateCertificate(@PathVariable Long id, @RequestBody Certificate certificate) {
        try {
            Certificate updated = service.updateCertificate(id, certificate);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCertificate(@PathVariable Long id) {
        service.deleteCertificate(id);
        return ResponseEntity.ok("Certificate deleted successfully!");
    }
}
