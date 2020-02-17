package com.java.allgemein.wissen.combinatorpattern;

import java.time.LocalDate;

import static com.java.allgemein.wissen.combinatorpattern.CustomerValidator.*;

public class CombinatorRunner {

    public static void main(String[] args) {

        Customer person = new Customer("Tim", "tim@hotmail.de", "0176234567", LocalDate.of(1990, 10,20));

        CustomerValidator.isEmailValid().apply(person);

        //Combinator Pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(person);

        System.out.println(result);
    }
}
