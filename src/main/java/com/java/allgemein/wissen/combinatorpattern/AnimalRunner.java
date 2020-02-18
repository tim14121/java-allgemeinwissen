package com.java.allgemein.wissen.combinatorpattern;

import java.util.ArrayList;
import java.util.List;

import static com.java.allgemein.wissen.combinatorpattern.AnimalValidator.*;
import static com.java.allgemein.wissen.combinatorpattern.AnimalValidator.isOlderThanFive;

public class AnimalRunner
{
    public static void main(String[] args) {
        Animal animal = new Animal("MonkeyA", "monkey_a", 8, Geschlecht.MAENNLICH);
        Animal animal2 = new Animal("MonkeyA", "monkey_a", 4, Geschlecht.WEIBLICH);

        System.out.println(isMale().apply(animal));
        System.out.println(isMale().apply(animal2));

        System.out.println(isMonkey().apply(animal));
        System.out.println(isMonkey().apply(animal2));

        System.out.println(isOlderThanFive().apply(animal));
        System.out.println(isOlderThanFive().apply(animal2));

        List<AnimalValidationResult> results = new ArrayList<>();
        results.add(isMonkey().apply(animal2));
        results.add(isMale().apply(animal2));
        results.add(isOlderThanFive().apply(animal2));

        for (AnimalValidationResult a : results){
            System.out.println(a);
        }
        //now use of Default-method and
        System.out.println(isMale().and(isMonkey()).and(isOlderThanFive()).apply(animal));
        System.out.println(isMale().and(isMonkey()).and(isOlderThanFive()).apply(animal2));

    }
}
