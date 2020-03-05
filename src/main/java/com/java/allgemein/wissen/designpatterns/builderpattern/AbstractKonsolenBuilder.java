package com.java.allgemein.wissen.designpatterns.builderpattern;

public abstract class AbstractKonsolenBuilder {
   abstract void buildName();
   abstract void buildErscheinungsjahr();
   abstract void buildMultiplayer();
   abstract void buildGroesse();
   abstract Konsole getKonsole();
}
