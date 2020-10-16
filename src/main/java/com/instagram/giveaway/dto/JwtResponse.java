package com.instagram.giveaway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private String email;
    private List<String> roles;
    private String firstName;
    private String lastName;


}
