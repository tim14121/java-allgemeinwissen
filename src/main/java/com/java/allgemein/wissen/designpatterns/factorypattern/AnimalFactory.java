package com.java.allgemein.wissen.designpatterns.factorypattern;

public class AnimalFactory {

    static Animal getAnimal(String type){

        if(type.equals("Cat")){
            return new Cat();
        }

        if(type.equals("Dog")){
            return new Dog();
        }

        return null;
    }
}
