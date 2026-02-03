package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    // Register User
    @PostMapping("/register")
    public UserEntity registerUser(@RequestBody UserEntity user) {
        return userService.registerUser(user);
    }

    // Login User
    @PostMapping("/login")
    public UserEntity loginUser(@RequestParam String email,
                                @RequestParam String password) {
        return userService.loginUser(email, password);
    }

    // Get user by id
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
