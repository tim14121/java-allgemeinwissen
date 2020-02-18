package com.java.allgemein.wissen.combinatorpattern;

public class Animal {

    private String name;
    private String art;
    private int age;
    private Geschlecht geschlecht;

    public Animal(String name, String art, int age, Geschlecht geschlecht) {
        this.name = name;
        this.art = art;
        this.age = age;
        this.geschlecht = geschlecht;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", geschlecht=" + geschlecht +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }
}

enum Geschlecht{
    MAENNLICH,
    WEIBLICH
}
