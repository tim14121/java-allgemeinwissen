package com.java.allgemein.wissen.combinatorpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.java.allgemein.wissen.combinatorpattern.AnimalValidationResult.*;

public interface AnimalValidator extends Function<Animal,AnimalValidationResult> {

    static AnimalValidator isMale(){
        System.out.println("Beginn Ueberpruefung:  isMale()");
        return holds(animal -> animal.getGeschlecht().equals(Geschlecht.MAENNLICH), Reason.NOT_MALE);
    }

    static AnimalValidator isMonkey(){
        System.out.println("Beginn Ueberpruefung:  isMonkey()");
        return holds(animal -> animal.getArt().startsWith("monkey"), Reason.WRONG_SPECIES);
    }

    static AnimalValidator isOlderThanFive(){
        System.out.println("Beginn Ueberpruefung:  isOlderThanFive()");
        return holds(animal -> animal.getAge()>5, Reason.TOO_YOUNG);
    }

    static AnimalValidator holds(Predicate<Animal> animalPredicate, Reason reason){
        return animal -> animalPredicate.test(animal)? valid(): invalid(reason);

    }

    static Function<Animal,List<AnimalValidationResult>>getAllValidationsResults(AnimalValidator...animalValidators){
        return animal ->
                Arrays.stream(animalValidators)
                        .map(animalValidator -> animalValidator.apply(animal))
                        .filter(animalValidationResult -> !animalValidationResult.isValid())
                        .collect(Collectors.toList());
    }

    default AnimalValidator and (AnimalValidator other){
        return animal ->{
            AnimalValidationResult animalValidationResult = this.apply(animal);
            return animalValidationResult.isValid()? other.apply(animal)   : animalValidationResult;
        };
    }
}

enum Reason{
    SUCCESS,
    NOT_MALE,
    WRONG_SPECIES,
    TOO_YOUNG
}

