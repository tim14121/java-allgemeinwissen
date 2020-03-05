package com.java.allgemein.wissen.designpatterns.builderpattern;

public class WiiBuilder extends AbstractKonsolenBuilder {
    private Konsole konsole;

    public WiiBuilder() {
        this.konsole = new Konsole();
    }

    @Override
    void buildName() {
       konsole.setName("Wii");
    }

    @Override
    void buildErscheinungsjahr() {
        konsole.setErscheinungsjahr("2004");
    }

    @Override
    void buildMultiplayer() {
        konsole.setMultiplayer("vorhanden");
    }

    @Override
    void buildGroesse() {
        konsole.setGroesse("20 Cm");
    }

    @Override
    Konsole getKonsole() {
        return konsole;
    }
}
