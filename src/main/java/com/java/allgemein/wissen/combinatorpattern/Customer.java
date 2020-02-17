package com.java.allgemein.wissen.combinatorpattern;

import java.time.LocalDate;

public class Customer {
    String name;
    String email;
    String phoneNumber;
    LocalDate bday;

    public Customer(String name, String email, String phoneNumber, LocalDate bday) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bday = bday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBday() {
        return bday;
    }

    public void setBday(LocalDate bday) {
        this.bday = bday;
    }
}
