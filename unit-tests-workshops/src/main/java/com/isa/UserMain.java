package com.isa;

import com.isa.user.User;

public class UserMain {

    public static void main(String[] args) {

        User user = new User("janko");

        System.out.println(user);

        user.setPassword("my-password");

        System.out.println(user);
    }
}
