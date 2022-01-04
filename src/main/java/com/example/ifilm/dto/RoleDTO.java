package com.example.ifilm.dto;

import com.example.ifilm.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RoleDTO implements Serializable {
    private Long id;
    private String name;
}
