package com.example.ifilm.service.impl;

import com.example.ifilm.dto.ResponseDTO;
import com.example.ifilm.dto.UserDTO;
import com.example.ifilm.service.UserService;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {

    @Override
    @Transactional
    public ResponseDTO register(UserDTO userDTO) {

        return null;
    }
}
