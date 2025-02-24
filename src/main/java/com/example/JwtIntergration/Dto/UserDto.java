package com.example.JwtIntergration.Dto;

import lombok.Data;

@Data

public class UserDto {
    private Long id;
    private String firstName;
    private String email;
    private String password;
}
