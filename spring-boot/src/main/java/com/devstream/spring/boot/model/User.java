package com.devstream.spring.boot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document("users")
public class User {

    @Id
    private String id;

    @Field(name = "email")
    private String email;

    @Field(name = "password")
    private String password;

    public User(String id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    public String getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
