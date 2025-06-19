package com.example.BlogAPI.Controller;

import com.example.BlogAPI.DTO.JWTAuthDTO;
import com.example.BlogAPI.DTO.LoginDTO;
import com.example.BlogAPI.DTO.OAuth2loginDTO;
import com.example.BlogAPI.DTO.SignUpDTO;
import com.example.BlogAPI.Entity.Oauth2DTO;
import com.example.BlogAPI.Service.AuthService;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.*;


import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Collections;

@RestController
@RequestMapping("")
@Log4j2
public class AuthenticationController {
    @Autowired
    AuthService authService;
    @GetMapping("/login")
    public ResponseEntity<JWTAuthDTO> getUser(@AuthenticationPrincipal OidcUser user) {
        OAuth2loginDTO login = new OAuth2loginDTO();
        login.setEmail(user.getEmail());
        login.setGender(user.getGender());
        login.setUsername(user.getGivenName());
        login.setFullName(user.getFamilyName());
        return new ResponseEntity<>(authService.OAuthLogin(login), HttpStatus.OK);
    }

    @GetMapping("/signup")
    public ResponseEntity<JWTAuthDTO> getUser(@AuthenticationPrincipal OidcUser email,@Valid @RequestBody SignUpDTO  user) {

        user.setEmail(email.getEmail());

        return new ResponseEntity<>(authService.signUp(user), HttpStatus.OK);
    }




}



