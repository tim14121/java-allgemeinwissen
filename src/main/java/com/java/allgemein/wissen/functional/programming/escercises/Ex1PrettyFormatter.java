package com.java.allgemein.wissen.functional.programming.escercises;

public class Ex1PrettyFormatter implements Ex1AppleFormatter {
    @Override
    public String accept(Ex1Apple apple) {

        String output;
        output = "The Apple has the colour: " + apple.getColour() + " its weight is: " + apple.getWeight() + " g";

        return output ;
    }
}
