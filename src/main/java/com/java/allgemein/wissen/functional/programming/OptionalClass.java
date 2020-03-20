package com.java.allgemein.wissen.functional.programming;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        OptionalClass optionalClass = new OptionalClass();
        optionalClass.createOptional();
        optionalClass.createOptional2();
    }

    public void createOptional() {

        Optional<String> hello = Optional.ofNullable("hello");

        System.out.println(hello.isPresent());

        String orElse = hello.orElse("world");
        System.out.println(orElse);

        //wenn String vorhanden, dann toUpperCase, sonst gab kein String zurückgeben
        String orElse2 = hello
                .map(a-> a.toUpperCase())
                .orElse("gab keinen String");
        System.out.println(orElse2);

        hello.ifPresent(word-> System.out.println(word));

    }

    public void createOptional2(){
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value);

        Optional.ofNullable("hello")
                .ifPresent(String::toUpperCase);
    }

}
