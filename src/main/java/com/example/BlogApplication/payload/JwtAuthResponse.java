package com.example.BlogApplication.payload;

import lombok.Data;


@Data
public class JwtAuthResponse {

    private String token;

    private UserDto user;
}
