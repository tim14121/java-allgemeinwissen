package com.java.allgemein.wissen.designpatterns.builderpattern;

public class Konsole {

    private String name;
    private String erscheinungsjahr;
    private String multiplayer;
    private String groesse;

    public void setName(String name) {
        this.name = name;
    }

    public void setErscheinungsjahr(String erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public void setMultiplayer(String multiplayer) {
        this.multiplayer = multiplayer;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    @Override
    public String toString() {
        return "Konsole{" +
                "name='" + name + '\'' +
                ", erscheinungsjahr='" + erscheinungsjahr + '\'' +
                ", multiplayer='" + multiplayer + '\'' +
                ", groesse='" + groesse + '\'' +
                '}';
    }
}
