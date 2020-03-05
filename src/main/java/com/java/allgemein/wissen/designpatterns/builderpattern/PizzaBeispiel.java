package com.java.allgemein.wissen.designpatterns.builderpattern;

public class PizzaBeispiel {

    private String name;
    private int groesse;
    private String kruste;
    private String sauce;

    private PizzaBeispiel(PizzaBuilder pizzaBuilder) {
        this.name = pizzaBuilder.name;
        this.groesse = pizzaBuilder.groesse;
        this.kruste = pizzaBuilder.kruste;
        this.sauce = pizzaBuilder.sauce;
    }

    @Override
    public String toString() {
        return "PizzaBeispiel{" +
                "name='" + name + '\'' +
                ", groesse=" + groesse +
                ", kruste='" + kruste + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    static class PizzaBuilder{
        private String name;
        private int groesse;
        private String kruste;
        private String sauce;



        public PizzaBuilder(String name, int groesse) {
            this.name = name;
            this.groesse = groesse;
        }

        public PizzaBuilder withKruste(String kruste){
            this.kruste = kruste;
            return this;
        }

        public PizzaBuilder withSauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public PizzaBeispiel buildPizza(){
            return new PizzaBeispiel(this);
        }
    }

}
