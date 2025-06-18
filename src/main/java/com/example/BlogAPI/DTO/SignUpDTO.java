package com.example.BlogAPI.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SignUpDTO {

    @NotBlank(message = "email is required.")
    @Email(message = "email is not valid.")
    private String email;
    @Size(min=8,message = "password must be atleast 8 characters")
    @Pattern(regexp = "^.*[0-9].*",message = "password must at least contain one digit.")
    @Pattern(regexp ="^.*[a-z].*",message = "password must contain at least on lower case character.")
    @Pattern(regexp = "^.*[A-Z].*",message = "password must contain at least one upper case character.")
    @Pattern(regexp = "^.*[@#$%^&+=!].*", message = "password must contain atleast one '@#$%^&+=!' special character.")
    private String password1;
    private String password2;

    @Size(min=4,message = "username must be at least 4 characters long.")
    private String username;
    @NotBlank(message = "message is necessary to filter blogs.")
    private int age;
    @Pattern(regexp = "^(male|female)$", flags = Pattern.Flag.CASE_INSENSITIVE,
            message = "Gender must be either 'male' or 'female'")
    private String gender;
}
