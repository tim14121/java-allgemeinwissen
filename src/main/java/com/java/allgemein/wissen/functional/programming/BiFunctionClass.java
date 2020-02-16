package com.java.allgemein.wissen.functional.programming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionClass {

    public static void main(String[] args) {
        BiFunctionClass biFunctionClass = new BiFunctionClass();
        biFunctionClass.createBiFunction();
    }

    public void createBiFunction(){
        BiFunction<Integer,Integer,Double> addTenMultiplayNumber = (targetNumber, multipliedBy)-> (double) ((targetNumber + 10) * multipliedBy);
        System.out.println(addTenMultiplayNumber.apply(4,5));

        BiFunction<Double,Double,Double> addFiveMultiplayNumber = (targetNumber, multipliedBy)-> (double) ((targetNumber + 5) * multipliedBy);
        System.out.println(addFiveMultiplayNumber.apply(4.0,5.0));
        System.out.println(addTenMultiplayNumber.apply(4,5));

        Function<Double,Double> multiplyByTwo = number -> number * 2;

        BiFunction<Integer, Integer, Double> togetherFunction = addTenMultiplayNumber.andThen(multiplyByTwo);
        System.out.println(togetherFunction.apply(4,5));


    }
}
