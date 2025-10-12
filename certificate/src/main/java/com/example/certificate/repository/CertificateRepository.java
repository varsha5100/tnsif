package com.example.certificate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.certificate.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> 
{
}
