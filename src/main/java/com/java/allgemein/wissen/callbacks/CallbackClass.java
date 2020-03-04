package com.java.allgemein.wissen.callbacks;

import java.util.function.Consumer;
import java.util.function.Function;

public class CallbackClass {

    public static void main(String[] args) {
        Function<String, String>stringFunction = s -> {
            if (s != null){

                return " " +  s;
            }
            s = " default message";

            return s;
        };
        hello("Tim","Abu", stringFunction);
        hello("Tim",null, stringFunction);

        hello2(null,s -> System.out.println("Firstname not provided"));
    }

    static void hello(String firstName, String lastName, Function<String,String> stringFunction){
        System.out.println("Hello: " + firstName +""+ stringFunction.apply(lastName));
    }

    static void hello2(String firstName, Consumer<String> consumer)
    {
        if (firstName != null){
            System.out.println(firstName);
        }
        else {
            consumer.accept(firstName);
        }
    }
}
