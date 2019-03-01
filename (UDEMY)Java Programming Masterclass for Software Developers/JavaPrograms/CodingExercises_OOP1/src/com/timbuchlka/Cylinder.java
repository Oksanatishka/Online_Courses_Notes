package com.timbuchlka;

public class Cylinder extends Circle {

    // fields
    private double height;

    // constructor
    public Cylinder(double radius, double height) {
        super(radius);
        if(height<0)
            this.height = 0;
        else
            this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return getArea() * this.getHeight();
    }
}
