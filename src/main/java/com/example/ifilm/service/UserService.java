package com.example.ifilm.service;

import com.example.ifilm.dto.ResponseDTO;
import com.example.ifilm.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void register(UserDTO userDTO);
}
