package com.example.ifilm.service;

import com.example.ifilm.dto.ResponseDTO;
import com.example.ifilm.dto.UserDTO;

public interface UserService {
    ResponseDTO register(UserDTO userDTO);
}
