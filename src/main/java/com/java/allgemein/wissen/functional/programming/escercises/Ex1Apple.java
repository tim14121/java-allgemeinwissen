package com.java.allgemein.wissen.functional.programming.escercises;

public class Ex1Apple {

    private String colour;
    private double weight;
    private boolean isReif;

    @Override
    public String toString() {
        return "Ex1Apple{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                ", isReif=" + isReif +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isReif() {
        return isReif;
    }

    public void setReif(boolean reif) {
        isReif = reif;
    }

    public Ex1Apple(String colour, double weight, boolean isReif) {
        this.colour = colour;
        this.weight = weight;
        this.isReif = isReif;
    }
}
