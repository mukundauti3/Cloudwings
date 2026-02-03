package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AdminEntity;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Admin login using username & password
    public AdminEntity loginAdmin(String username, String password) {

        Optional<AdminEntity> adminOpt = adminRepository.findByUserName(username);

        if (adminOpt.isPresent() &&
            adminOpt.get().getPassWord().equals(password)) {

            return adminOpt.get();   // login success
        }

        return null; // login failed (simple handling)
    }

    // Get admin by phone number (PRIMARY KEY)
    public AdminEntity getAdminByPhone(String phoneNo) {
        return adminRepository.findById(phoneNo).orElse(null);
    }
}
