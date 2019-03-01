package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Hamburger hamburger = new Hamburger("Basic", "White", "beef", 3.25);
        double price = hamburger.itemizeHamburger();

        hamburger.addAddition1("Tomato", 0.35);
        hamburger.addAddition2("Lettuce", 0.56);
        hamburger.addAddition3("Cheese", 1.45);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        System.out.println("-------------");

        HealthierBurger healthierBurger = new HealthierBurger("Bacon", 5.67);
        healthierBurger.addHealthyAddition1("Egg", 4.67);
        System.out.println("Total Heathy Burger price is " + healthierBurger.itemizeHamburger());

        System.out.println("-------------");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addAddition1("Should not do this", 50.55);
        deluxeHamburger.itemizeHamburger();
    }
}
