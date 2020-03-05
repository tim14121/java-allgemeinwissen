package com.java.allgemein.wissen.designpatterns.builderpattern;

public class UserMain {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Tim",26).withGroesse(178).build();
        System.out.println(user);
    }
}
