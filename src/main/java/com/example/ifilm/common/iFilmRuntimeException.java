package com.example.ifilm.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class iFilmRuntimeException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String code;
    private String message;

    public iFilmRuntimeException(String code) {
        this.code = code;
    }
}
