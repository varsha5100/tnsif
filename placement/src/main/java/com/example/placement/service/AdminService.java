package com.example.placement.service;

import com.example.placement.model.Admin;
import com.example.placement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repo;

    public Admin register(Admin admin) {
        return repo.save(admin);
    }

    public boolean login(String name, String password) {
        Admin admin = repo.findByName(name);
        return admin != null && admin.getPassword().equals(password);
    }

    public List<Admin> getAllAdmins() {
        return repo.findAll();
    }

    public Admin getAdminById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Admin updateAdmin(Long id, Admin updatedAdmin) {
        Optional<Admin> optional = repo.findById(id);
        if (optional.isPresent()) {
            Admin existing = optional.get();
            existing.setName(updatedAdmin.getName());
            existing.setPassword(updatedAdmin.getPassword());
            return repo.save(existing);
        } else {
            return null;
        }
    }

    public boolean deleteAdmin(Long id) {
        Optional<Admin> optional = repo.findById(id);
        if (optional.isPresent()) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}


