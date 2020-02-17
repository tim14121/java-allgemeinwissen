package com.java.allgemein.wissen.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.java.allgemein.wissen.combinatorpattern.ValidationResult.*;

public interface CustomerValidator extends Function<Customer, ValidationResult> {

    static CustomerValidator isEmailValid() {
        System.out.println("Überprüfung EMAIL");
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerValidator isPhoneNumberValid() {
        System.out.println("Überprüfung PHONE");
        return customer -> customer.getPhoneNumber().startsWith("0") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerValidator isAdult() {
        System.out.println("Überprüfung ADULT");
        return customer -> Period.between(customer.getBday(),LocalDate.now()).getYears() >18 ?
                SUCCESS:NOT_ADULT;
    }

    default CustomerValidator and(CustomerValidator other){
        return customer -> {
            ValidationResult validationResult = this.apply(customer);
            return SUCCESS.equals(validationResult)? other.apply(customer): validationResult;
        };
    }


}


enum ValidationResult {
    SUCCESS,
    EMAIL_NOT_VALID,
    PHONE_NUMBER_NOT_VALID,
    NOT_ADULT
}


