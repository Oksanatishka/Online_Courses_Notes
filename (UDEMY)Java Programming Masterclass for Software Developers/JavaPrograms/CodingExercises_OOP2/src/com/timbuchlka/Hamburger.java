package com.timbuchlka;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    // Additions: lettuce / tomato / carrot / etc (up to 4)
    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAddition1(String addition1, double addition1Price){
        this.addition1 = addition1;
        this.addition1Price = addition1Price;
    }

    public void addAddition2(String addition2, double addition2Price){
        this.addition2 = addition2;
        this.addition2Price = addition2Price;
    }

    public void addAddition3(String addition3, double addition3Price){
        this.addition3 = addition3;
        this.addition3Price = addition3Price;
    }

    public void addAddition4(String addition4, double addition4Price){
        this.addition4 = addition4;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll" + " with " + this.meat +
                ", price is " + this.price);
        if(this.addition1 != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1 + " for an extra " + this.addition1Price);
        }
        if(this.addition2 != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2 + " for an extra " + this.addition2Price);
        }
        if(this.addition3 != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3 + " for an extra " + this.addition3Price);
        }
        if(this.addition4 != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4 + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }
}
