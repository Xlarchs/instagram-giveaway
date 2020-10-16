package com.instagram.giveaway.controller;

import com.instagram.giveaway.dto.LoginRequest;
import com.instagram.giveaway.dto.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.instagram.giveaway.service.auth.AuthService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated @RequestBody SignupRequest signUpRequest) {
        return authService.register(signUpRequest);
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Validated @RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

}
