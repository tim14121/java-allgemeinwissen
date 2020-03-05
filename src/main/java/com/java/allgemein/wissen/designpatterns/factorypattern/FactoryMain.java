package com.java.allgemein.wissen.designpatterns.factorypattern;

public class FactoryMain {

    public static void main(String[] args) {
        Cat cat = (Cat)AnimalFactory.getAnimal("Cat");
        cat.speak();

        Animal animal = AnimalFactory.getAnimal("Dog");
        animal.speak();
    }
}
