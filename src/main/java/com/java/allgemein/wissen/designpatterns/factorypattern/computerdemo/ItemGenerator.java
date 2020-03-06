package com.java.allgemein.wissen.designpatterns.factorypattern.computerdemo;

public class ItemGenerator extends AbstractItemGenerator {
    Item item;

    @Override
    Item createItem(String itemType) {
        item = null;
        System.out.println("Itemtype: " + itemType);
        if (itemType.equals("Hammer")) {
            System.out.println("in Hammer");
            item = new Hammer();
        }
        if (itemType.equals("Shield")) {
            System.out.println("In Shield");
            item = new Shield();
        }


        return item;
    }
}
