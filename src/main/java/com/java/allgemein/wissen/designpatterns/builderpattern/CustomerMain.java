package com.java.allgemein.wissen.designpatterns.builderpattern;

public class CustomerMain {

    public static void main(String[] args) {
        Customer customer = new Customer.CustomerBuilder("tim", 18).withColour("green").withHeigth(176).build();
        System.out.println(customer);
    }
}
