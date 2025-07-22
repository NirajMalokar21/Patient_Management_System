package com.pm.authservice.service;

import com.pm.authservice.dto.LoginRequestDTO;
import com.pm.authservice.model.User;

import java.util.Optional;

public class AuthService {
    private final UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public Optional<String> authenticate(LoginRequestDTO loginRequestDTO) {
        Optional<User> user = userService.findByEmail(loginRequestDTO.getEmail());
        // Start at  7:18:21, delete the return statement
        return user.map(User::getPassword);
    }
}
