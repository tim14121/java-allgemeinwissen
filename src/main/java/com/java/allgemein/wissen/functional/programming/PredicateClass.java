package com.java.allgemein.wissen.functional.programming;

import java.util.function.Predicate;

public class PredicateClass {

    final String phoneNumber1 = "0176123456";
    final String phoneNumber2 = "0177123456";
    final String phoneNumber3 = "0178123456";
    final String phoneNumber4 = "0179123456";

    public static void main(String[] args) {
        Predicate<String> predicate;

        PredicateClass predicateClass = new PredicateClass();

        predicate = predicateClass.createPredicate();
        System.out.println(predicate.test(predicateClass.phoneNumber1));
        System.out.println(predicate.test(predicateClass.phoneNumber2));
        System.out.println(predicate.test(predicateClass.phoneNumber3));
        System.out.println(predicate.test(predicateClass.phoneNumber4));
    }

    public Predicate<String> createPredicate(){

        Predicate<String> stringPredicate = phone -> phone.startsWith("0176") && phone.contains("3");
        return stringPredicate;
    }
}
