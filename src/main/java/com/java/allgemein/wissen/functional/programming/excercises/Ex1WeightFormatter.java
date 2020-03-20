package com.java.allgemein.wissen.functional.programming.excercises;

public class Ex1WeightFormatter implements Ex1AppleFormatter {


    @Override
    public String accept(Ex1Apple apple) {
        String output ;
        if(apple.getWeight()>=150.00){
            output ="Its a very big apple";
        }
        else{
            output ="Its a small apple";
        }
        return output;
    }
}
