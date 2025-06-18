package com.example.BlogAPI.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true, nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private int age;
    @Column()
    private String gender;
    @Column()
    String role="ROLE_USER";

}
