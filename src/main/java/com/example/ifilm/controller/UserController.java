package com.example.ifilm.controller;

import com.example.ifilm.dto.UserDTO;
import com.example.ifilm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("registration")
    public ResponseEntity<UserDTO> register(@Valid @RequestBody UserDTO userDTO, HttpServletRequest request){
        userService.register(userDTO);
        return ResponseEntity.ok().body(null);
    }
}
