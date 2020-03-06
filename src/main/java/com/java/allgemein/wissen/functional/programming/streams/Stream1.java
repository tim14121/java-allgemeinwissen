package com.java.allgemein.wissen.functional.programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {

    public static void main(String[] args) {
        List<Person>people = createPersonList();

        // filtern nach allen maennlichen und diese dann mit großen Buchstaben ausgeben
        List<String>allMaleNames = people.stream()
                .filter(person -> person.getGender().equals("male"))
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(allMaleNames);


        // die Summe des Alters von jeder Person
        Integer sumOfAllAges = people.stream()
                .map(Person::getAge)
                .reduce(0, (carry, age) -> carry + age);
        System.out.println(sumOfAllAges);

        // andere Möglichkeit das Alter zu summieren    -> mapToInt erzeugt einen IntegerStream der die sum() Methode besitzt
        int sumAges = people.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(sumAges);


    }

    static List<Person> createPersonList(){
        return Arrays.asList(
                new Person("Tim",20,170.00,"male"),
                new Person("Bau",40,120.00,"male"),
                new Person("Tima",4,150.00,"female"),
                new Person("Baoa",20,170.00,"female")
        );
    }
}
