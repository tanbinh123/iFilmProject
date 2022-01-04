package com.example.ifilm.mapper;

import com.example.ifilm.domain.User;
import com.example.ifilm.dto.UserDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper for the entity {@link com.example.ifilm.domain.User} and its DTO {@link com.example.ifilm.dto.UserDTO}.
 */
@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {
    User toEntity(UserDTO userDTO);
    UserDTO toDto(User user);
    List<User> toEntity(List<UserDTO> dtoList);
    List<UserDTO> toDto(List<User> entityList);
}
