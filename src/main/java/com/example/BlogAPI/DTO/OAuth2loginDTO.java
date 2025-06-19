package com.example.BlogAPI.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class OAuth2loginDTO {
    @NotBlank(message = "email is required.")
    @Email(message = "email is not valid.")
    private String email;



    @Size(min=4,message = "username must be at least 4 characters long.")
    private String username;
    @Min(value = 1,message = "message is necessary to filter blogs.")
    @Pattern(regexp = "^(male|female)$", flags = Pattern.Flag.CASE_INSENSITIVE,
            message = "Gender must be either 'male' or 'female'")
    private String gender;

    @NotBlank
    private String fullName;
}
