package com.example.BlogAPI.Service.impl;

import com.example.BlogAPI.DTO.JWTAuthDTO;
import com.example.BlogAPI.DTO.OAuth2loginDTO;
import com.example.BlogAPI.DTO.SignUpDTO;
import com.example.BlogAPI.Entity.User;
import com.example.BlogAPI.Repo.UserRepo;
import com.example.BlogAPI.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceimpl implements AuthService {
//    private PasswordEncoder passwordEncoder;
    @Autowired
    UserRepo userRepo;
    @Override
    public JWTAuthDTO signUp(SignUpDTO details) {
        if(!details.getPassword1().equals(details.getPassword2())) {
            throw new IllegalArgumentException("Passwords do not match");
        }
        if(details.getGender().isEmpty()){
            details.setGender("male");
        }
        User user = new User();
        user.setEmail(details.getEmail());
        user.setPassword(details.getPassword1());
        user.setAge(details.getAge());
        user.setGender(details.getGender());
        return null;

    }

     public JWTAuthDTO Login(Object login){
        if(login instanceof OAuth2loginDTO) {
            OAuth2loginDTO dto = (OAuth2loginDTO) login;
            Optional<User> user= userRepo.findByEmailOrUsername(dto.getEmail(),dto.getUsername());
            if(user.isPresent()) {

            }

        }
    }
}
