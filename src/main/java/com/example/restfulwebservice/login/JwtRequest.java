package com.example.restfulwebservice.login;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class JwtRequest {
    private String email;
    private String password;
}
