package com.instagram.giveaway.dto;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class SignupRequest {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Set<String> role;
    private String password;
}