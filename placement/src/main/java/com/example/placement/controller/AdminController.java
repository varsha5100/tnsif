package com.example.placement.controller;

import com.example.placement.model.Admin;
import com.example.placement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    // Create (POST)
    @PostMapping("/register")
    public ResponseEntity<Admin> register(@RequestBody Admin admin) {
        return ResponseEntity.ok(service.register(admin));
    }

    // Login (POST)
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Admin admin) {
        boolean success = service.login(admin.getName(), admin.getPassword());
        if (success)
            return ResponseEntity.ok("Login successful");
        else
            return ResponseEntity.status(401).body("Invalid credentials");
    }

    // ✅ Get all admins
    @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAllAdmins() {
        return ResponseEntity.ok(service.getAllAdmins());
    }

    // ✅ Get admin by ID
    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
        Admin admin = service.getAdminById(id);
        if (admin != null)
            return ResponseEntity.ok(admin);
        else
            return ResponseEntity.notFound().build();
    }

    // ✅ Update admin (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin updatedAdmin) {
        Admin admin = service.updateAdmin(id, updatedAdmin);
        if (admin != null)
            return ResponseEntity.ok(admin);
        else
            return ResponseEntity.notFound().build();
    }

    // ✅ Delete admin (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAdmin(@PathVariable Long id) {
        boolean deleted = service.deleteAdmin(id);
        if (deleted)
            return ResponseEntity.ok("Admin deleted successfully");
        else
            return ResponseEntity.status(404).body("Admin not found");
    }
}
