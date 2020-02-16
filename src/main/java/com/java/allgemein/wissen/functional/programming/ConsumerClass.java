package com.java.allgemein.wissen.functional.programming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerClass {

    public static void main(String[] args) {
        ConsumerClass consumerClass = new ConsumerClass();
        consumerClass.createConsumerFunction();
        consumerClass.createBiConsumerFunction();
    }

    public void createConsumerFunction(){
        Consumer<User> greetingFunction= user -> System.out.println("Hello "
                + user.name + " from " + user.city);

        greetingFunction.accept(new User("Tim", "Berlin"));
    }

    public void createBiConsumerFunction(){
        BiConsumer<User,Boolean> greetingFctWithBoolean = (user, shouldShowCity) ->
                System.out.println("Hello " + user.name + " from " + (shouldShowCity? user.city: "****"));

        greetingFctWithBoolean.accept(new User("Tim", "Berlin"),false);
        greetingFctWithBoolean.accept(new User("Jino", "Berlin"),true);
    }

    static class User {


        final String name;
        final String city;
        public User(String name, String city) {
            this.name = name;
            this.city = city;
        }

    }
}
