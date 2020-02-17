package com.java.allgemein.wissen.functional.programming;

import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

import static com.java.allgemein.wissen.functional.programming.StreamClass.Gender.*;

public class StreamClass {

    public static void main(String[] args) {

        List<Person>people = List.of(
                new Person("John", MALE),
                new Person("Tylor", MALE),
                new Person("Chlow", FEMALE),
                new Person("Crazy", DIVERSE)
        );

        StreamClass streamClass = new StreamClass();
        streamClass.streamOperationsOnList(people);




    }

    public void streamOperationsOnList(List<Person>people){

        //Alle männlichen ausgeben
        people.stream()
                .filter(person -> person.getGender().equals(MALE))
                .forEach(person -> System.out.println(person.toString()));

        //Alle Gender die es gibt ausgeben
        people.stream()
                //alle Personen auf das Gender reduzieren
                .map(person -> person.gender)
                // alle Duplikate eliminieren
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Alle Namen ausgeben
        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Überprüft ob es nur Frauen in der Liste gibt
        boolean containsOnlyFemale = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.println("Es gibt nur Frauen: " + containsOnlyFemale);


    }





    static class Person{
        String name;
        Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    public enum Gender {
        MALE,
        FEMALE,
        DIVERSE
    }

}
