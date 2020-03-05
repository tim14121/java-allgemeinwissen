package com.java.allgemein.wissen.designpatterns.builderpattern;

public class PizzaMain {

    public static void main(String[] args) {
        PizzaBeispiel pizzaBeispiel = new PizzaBeispiel.PizzaBuilder("Pizza Salami", 4)
                .withKruste("Kross")
                .withSauce("Tomatensauce")
                .buildPizza();

        System.out.println(pizzaBeispiel);
    }
}
