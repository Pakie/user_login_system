package com.example.user_login_system.service;

import com.example.user_login_system.model.User;
import com.example.user_login_system.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
