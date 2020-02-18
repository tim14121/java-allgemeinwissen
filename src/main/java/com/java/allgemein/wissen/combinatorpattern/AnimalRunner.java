package com.java.allgemein.wissen.combinatorpattern;

import java.util.List;
import java.util.function.Function;

import static com.java.allgemein.wissen.combinatorpattern.AnimalValidator.*;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal("MonkeyA", "onkey_a", 8, Geschlecht.WEIBLICH);
        Animal animal2 = new Animal("MonkeyA", "monkey_a", 4, Geschlecht.WEIBLICH);

      /*  AnimalValidationResult validationResult = isMale().apply(animal);
        System.out.println(validationResult.getReason());
        AnimalValidationResult validationResult2 = isMale().apply(animal2);
        System.out.println(validationResult2.getReason()); */


        AnimalValidator animalValidator = isMale().and(isMonkey().and(isMale()));
        AnimalValidationResult combinedResult = animalValidator.apply(animal);
        System.out.println(combinedResult.getReason());

        AnimalValidator animalValidationResult[] = {isMale(), isOlderThanFive(), isMonkey()};
        Function<Animal, List<AnimalValidationResult>> animalAnimalValidatorFunction = getAllValidationsResults(animalValidationResult);
        List<AnimalValidationResult> result = animalAnimalValidatorFunction.apply(animal);
        result.forEach(item -> System.out.println(item.getReason()));


    }
}
