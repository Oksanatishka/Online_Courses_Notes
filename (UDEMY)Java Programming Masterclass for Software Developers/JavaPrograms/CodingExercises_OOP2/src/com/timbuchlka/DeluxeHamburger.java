package com.timbuchlka;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("Deluxe", "White", "sausage & bacon", 14.34);
        super.addAddition1("Chips", 2.75);
        super.addAddition2("Drink", 3.41);
    }

    @Override
    public void addAddition1(String addition1, double addition1Price) {
        System.out.println("Cannot add addititonal items to a deluxe burger");
    }

    @Override
    public void addAddition2(String addition2, double addition2Price) {
        System.out.println("Cannot add addititonal items to a deluxe burger");
    }

    @Override
    public void addAddition3(String addition3, double addition3Price) {
        System.out.println("Cannot add addititonal items to a deluxe burger");
    }

    @Override
    public void addAddition4(String addition4, double addition4Price) {
        System.out.println("Cannot add addititonal items to a deluxe burger");
    }
}
