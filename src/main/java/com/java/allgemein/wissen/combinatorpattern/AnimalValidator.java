package com.java.allgemein.wissen.combinatorpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static com.java.allgemein.wissen.combinatorpattern.AnimalValidationResult.*;

public interface AnimalValidator extends Function<Animal,AnimalValidationResult> {

    static AnimalValidator isMale(){
        System.out.println("Beginn Ueberpruefung:  isMale()");
        return animal -> animal.getGeschlecht().equals(Geschlecht.MAENNLICH)?
                SUCCESS :
                NOT_MALE;
    }

    static AnimalValidator isMonkey(){
        System.out.println("Beginn Ueberpruefung:  isMonkey()");
        return animal -> animal.getArt().startsWith("monkey")?
                SUCCESS:
                WRONG_SPECIES;
    }

    static AnimalValidator isOlderThanFive(){
        System.out.println("Beginn Ueberpruefung:  isOlderThanFive()");
        return animal -> animal.getAge()> 5?
                SUCCESS:
                TOO_YOUNG;
    }

    default AnimalValidator and (AnimalValidator other){
        return animal ->{
            AnimalValidationResult animalValidationResult = this.apply(animal);
            return SUCCESS.equals(animalValidationResult)? other.apply(animal)   : animalValidationResult;
        };
    }
}

enum AnimalValidationResult{
    SUCCESS,
    NOT_MALE,
    WRONG_SPECIES,
    TOO_YOUNG
}
