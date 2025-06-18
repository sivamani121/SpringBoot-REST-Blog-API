package com.example.BlogAPI.DTO;

import lombok.Data;

@Data
public class JWTAuthDTO {
    private String token;
    private String type="Bearer";
    private String username;
}
