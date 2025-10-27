package com.example.spring_security_jwt_oauth2_demo.dto;

import com.example.spring_security_jwt_oauth2_demo.entities.User;

public record UserDTO(
        String name,
        String login,
        String password
) {
}
