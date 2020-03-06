package com.java.allgemein.wissen.designpatterns.factorypattern.computerdemo;

public class Hammer extends Item {
    public int attackValue;
    @Override
    void useItem() {
        System.out.println("Du benutzt einen Hammer");
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "attackValue=" + attackValue +
                '}';
    }
}
