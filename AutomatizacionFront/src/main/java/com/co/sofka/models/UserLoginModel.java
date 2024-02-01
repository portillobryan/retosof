package com.co.sofka.models;

public class UserLoginModel {

    private String username;
    private String password;

    public UserLoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
