package com.instagram.giveaway.service.auth;

import com.instagram.giveaway.dto.LoginRequest;
import com.instagram.giveaway.dto.SignupRequest;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface AuthService {
    public ResponseEntity<?> register(SignupRequest signUpRequest);

    public ResponseEntity<?> login(LoginRequest loginRequest);
}
