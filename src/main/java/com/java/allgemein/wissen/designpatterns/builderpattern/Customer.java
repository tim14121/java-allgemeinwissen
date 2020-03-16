package com.java.allgemein.wissen.designpatterns.builderpattern;

public class Customer {

    String name;
    int age;
    int heigth;
    String colour;

    private Customer(CustomerBuilder customerBuilder){
        this.age = customerBuilder.age;
        this.name = customerBuilder.name;
        this.heigth = customerBuilder.heigth;
        this.colour = customerBuilder.colour;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                ", colour='" + colour + '\'' +
                '}';
    }

    static class CustomerBuilder{
        String name;
        int age;
        int heigth;
        String colour;

        public CustomerBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public CustomerBuilder withHeigth(int heigth){
            this.heigth = heigth;
            return this;
        }
        public CustomerBuilder withColour(String colour){
            this.colour = colour;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
