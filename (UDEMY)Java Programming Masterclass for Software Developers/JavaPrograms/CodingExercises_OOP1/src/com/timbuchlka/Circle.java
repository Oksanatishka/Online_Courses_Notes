package com.timbuchlka;

public class Circle {

    // fields
    private double radius;

    // constructor
    public Circle(double radius) {

        if(radius < 0)
            this.radius = 0;
        else
            this.radius = radius;
    }
    // getter
    public double getRadius(){
        return this.radius;
    }
    // method
    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }
}
