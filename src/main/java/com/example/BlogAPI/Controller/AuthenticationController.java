package com.example.BlogAPI.Controller;

import com.example.BlogAPI.DTO.JWTAuthDTO;
import com.example.BlogAPI.DTO.SignUpDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AuthenticationController {
//    @PostMapping("/login")
//    public ResponseEntity<JWTAuthResponse> login(@RequestParam String username, @RequestParam String password) {
//
//    }

    @PostMapping("signUp")
    public ResponseEntity<JWTAuthDTO> signUp(@RequestBody SignUpDTO signUpDTO) {

    return null;
    }
}
