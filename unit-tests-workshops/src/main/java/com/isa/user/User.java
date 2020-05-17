package com.isa.user;

import org.apache.commons.lang3.StringUtils;

public class User {

    private static final String DEFAULT_PASSWORD = "d3f4u17";

    private String login;
    private String password;

    public User() {
        throw new IllegalArgumentException("Login is mandatory to be provided when user is created!");
    }

    public User(String login) {

        if (StringUtils.isEmpty(login)) {
            throw new IllegalArgumentException("Login is not allowed to be empty!");
        }

        this.login = login;
        this.password = DEFAULT_PASSWORD;
    }

    public void setPassword(String password) {

        if (StringUtils.isEmpty(password)) {
            throw new IllegalArgumentException("Password is not allowed to be empty!");
        }

        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
