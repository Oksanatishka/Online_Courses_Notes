package com.timbuchlka;

public class Wall {
    private double width;
    private double height;

    // constructors
    public Wall() {
        System.out.println("Constructor was called");
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0)
            this.width = 0;
        if (height < 0)
            this.height = 0;
    }

    // methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0)
            this.width = 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if (height < 0)
            this.height = 0;
    }

    public double getArea(){
        return this.width * this.height;
    }
}