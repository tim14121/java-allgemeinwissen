package com.java.allgemein.wissen.functional.programming.streams;

import java.awt.*;
import java.util.zip.DataFormatException;

public class Person {

    private String name;
    private int age;
    private double groesse;
    private String gender;

    public Person(String name, int age, double groesse, String gender) {
        this.name = name;
        this.age = age;
        this.groesse = groesse;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groesse=" + groesse +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGroesse() {
        return groesse;
    }

    public String getGender() {
        return gender;
    }
}
