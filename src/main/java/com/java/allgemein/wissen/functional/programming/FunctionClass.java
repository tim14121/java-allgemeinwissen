package com.java.allgemein.wissen.functional.programming;

import java.util.function.Function;

public class FunctionClass {

    public static void main(String[] args) {


        Function<Integer,Integer>addingTen = number -> number +10;
        Function<Integer,Integer>multiplyTen = number -> number *10;
        Function<Integer,Integer>addMultiplyTen = addingTen.andThen(multiplyTen);

        System.out.println(addingTen.apply(4));
        System.out.println(multiplyTen.apply(4));
        System.out.println(addMultiplyTen.apply(4));

        Function<Double,Double>multiplyTwoPointFive = number -> number * 2.5;
        System.out.println(multiplyTwoPointFive.apply(4.0));

    }
}
