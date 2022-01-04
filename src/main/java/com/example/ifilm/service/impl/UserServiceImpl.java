package com.example.ifilm.service.impl;

import com.example.ifilm.common.iFilmBusinessException;
import com.example.ifilm.domain.User;
import com.example.ifilm.dto.ResponseDTO;
import com.example.ifilm.dto.UserDTO;
import com.example.ifilm.mapper.UserMapper;
import com.example.ifilm.repository.UserRepository;
import com.example.ifilm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional
    public void register(UserDTO userDTO) {
        if(Objects.nonNull(userDTO.getEmail())){
            if(!userRepository.findByEmail(userDTO.getEmail()).isPresent()){
                throw new RuntimeException("Email already exist!");
            }
            User user = userMapper.toEntity(userDTO);
            userRepository.save(user);
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException(""));
    }
}
