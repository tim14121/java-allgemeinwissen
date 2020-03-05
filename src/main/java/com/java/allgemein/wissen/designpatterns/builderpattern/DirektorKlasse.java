package com.java.allgemein.wissen.designpatterns.builderpattern;

public class DirektorKlasse {

    AbstractKonsolenBuilder abstractKonsolenBuilder;

    public DirektorKlasse(AbstractKonsolenBuilder abstractKonsolenBuilder) {
        this.abstractKonsolenBuilder = abstractKonsolenBuilder;
    }

    public void constructKonsole(){
        abstractKonsolenBuilder.buildName();
        abstractKonsolenBuilder.buildErscheinungsjahr();
        abstractKonsolenBuilder.buildGroesse();
        abstractKonsolenBuilder.buildMultiplayer();
    }

    public Konsole getKonsole(){
        return abstractKonsolenBuilder.getKonsole();
    }
}
