package com.main.carshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;
}

public User(String username, String password, String role) {
    this.username=username;
    this.password=password;
    this.role=role;
}

public setUsername(String username) {
    this.username = username;
}
public setPassword(String password) {
    this.password = password;
}
public setRole(String role) {
    this.role = role;
}