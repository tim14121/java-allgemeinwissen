package com.java.allgemein.wissen.designpatterns.factorypattern.computerdemo;

public abstract class AbstractItemGenerator {

    abstract Item createItem(String itemType);

    public Item useLootItem(String itemType) {
        Item item = null;

        item = createItem(itemType);


        item.useItem();
        return item;
    }
}
