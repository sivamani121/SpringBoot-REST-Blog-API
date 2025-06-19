package com.example.BlogAPI.Service;

import com.example.BlogAPI.DTO.JWTAuthDTO;
import com.example.BlogAPI.DTO.SignUpDTO;

public interface AuthService {
    JWTAuthDTO signUp(SignUpDTO details) ;
}
