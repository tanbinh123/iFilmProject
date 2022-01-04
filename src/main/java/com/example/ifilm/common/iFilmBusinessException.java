package com.example.ifilm.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class iFilmBusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    private List<?> data;
    private List<?> fieldErrorDTOS;

    public iFilmBusinessException(String code) {
        this.code = code;
    }
}
