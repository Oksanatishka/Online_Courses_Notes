package com.timbuchlka;

public class Dog extends Animal {

    // fields
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // brain = 1 (all dogs have brain), body =1

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() was called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() was called.");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() is called");
        move(10);
    }

}
