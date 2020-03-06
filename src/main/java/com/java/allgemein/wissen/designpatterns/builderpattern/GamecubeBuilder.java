package com.java.allgemein.wissen.designpatterns.builderpattern;

public class GamecubeBuilder extends AbstractKonsolenBuilder {

    private Konsole konsole;

    public GamecubeBuilder() {
        this.konsole = new Konsole();
    }


    @Override
    void buildName() {
        konsole.setName("Gamecube");
    }

    @Override
    void buildErscheinungsjahr() {
        konsole.setErscheinungsjahr( "2000");
    }

    @Override
    void buildMultiplayer() {
        konsole.setMultiplayer("vorhanden");
    }

    @Override
    void buildGroesse() {
        konsole.setGroesse("10cm");
    }

    @Override
    Konsole getKonsole() {
        return konsole;
    }
}
