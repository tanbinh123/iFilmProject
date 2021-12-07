package com.example.ifilm.controller;

import com.example.ifilm.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {
    public ResponseEntity<UserDTO> register(@Valid @RequestBody UserDTO userDTO){
        return null;
    }
}
