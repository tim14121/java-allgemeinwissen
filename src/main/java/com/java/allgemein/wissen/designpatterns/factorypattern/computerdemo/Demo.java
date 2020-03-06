package com.java.allgemein.wissen.designpatterns.factorypattern.computerdemo;

public class Demo {

    public static void main(String[] args) {
        Item item = null;
        Item item2 = null;
        AbstractItemGenerator abstractItemGenerator = new ItemGenerator();
        item2 = abstractItemGenerator.useLootItem("Shield");
        item2 = abstractItemGenerator.useLootItem("Hammer");
    }
}
