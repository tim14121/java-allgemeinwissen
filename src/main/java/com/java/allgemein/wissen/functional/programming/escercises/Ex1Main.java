package com.java.allgemein.wissen.functional.programming.escercises;

import java.util.ArrayList;
import java.util.List;

public class Ex1Main {
    public List <Ex1Apple> ex1AppleList;

    public static void main(String[] args) {
        // es soll eine prettyPrintApple Methode geschrieben werden die einen Output erzeugt,
        // es wird eine Liste an Apples uebergeben und der output wird vom Apple erzeugt, man soll mit Predicate arbeiten
        Ex1Main main = new Ex1Main();
        main.ex1AppleList = main.createExampleList();
        main.prettyPrintApple(main.ex1AppleList,new Ex1PrettyFormatter());
        main.prettyPrintApple(main.ex1AppleList,new Ex1WeightFormatter());

        //old fashioned way
        main.prettyPrintApple(main.ex1AppleList, new Ex1AppleFormatter() {
            @Override
            public String accept(Ex1Apple apple) {
                return "The colour of the apple is: " + apple.getColour();
            }
        });

        // Lambda möglich da das Interface nur eine Methode hat
        main.prettyPrintApple(main.ex1AppleList, apple -> "Der Apfel ist reif ? " + ""+ apple.isReif());

    }

    public List<Ex1Apple> createExampleList() {
        Ex1Apple ex1Apple1 = new Ex1Apple("green", 170.00, true);
        Ex1Apple ex1Apple2 = new Ex1Apple("red", 170.00, true);
        Ex1Apple ex1Apple3 = new Ex1Apple("green", 80.00, false);
        Ex1Apple ex1Apple4 = new Ex1Apple("red", 70.00, true);

        List<Ex1Apple> appleList = new ArrayList<>();
        appleList.add(ex1Apple1);
        appleList.add(ex1Apple2);
        appleList.add(ex1Apple3);
        appleList.add(ex1Apple4);

        return appleList;

    }

    public void prettyPrintApple(List<Ex1Apple>list, Ex1AppleFormatter formatter){
        for (Ex1Apple apple : list){
            String output= formatter.accept(apple);
            System.out.println(output);
        }

    }
}
