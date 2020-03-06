package com.java.allgemein.wissen.designpatterns.factorypattern.computerdemo;

public class Shield extends Item {

    public int defenseValue;
    @Override
    void useItem() {
        System.out.println("Du benutzt ein Schild");
    }
}
