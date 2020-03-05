package com.java.allgemein.wissen.designpatterns.builderpattern;

public class MainKlasse {

    public static void main(String[] args) {
        AbstractKonsolenBuilder abstractKonsolenBuilder = new GamecubeBuilder();
        AbstractKonsolenBuilder abstractKonsolenBuilder2 = new WiiBuilder();

        DirektorKlasse direktorKlasse = new DirektorKlasse(abstractKonsolenBuilder);
        DirektorKlasse direktorKlasse2 = new DirektorKlasse(abstractKonsolenBuilder2);

        direktorKlasse.constructKonsole();
        direktorKlasse2.constructKonsole();

        System.out.println(direktorKlasse.getKonsole());
        System.out.println(direktorKlasse2.getKonsole());
    }
}
