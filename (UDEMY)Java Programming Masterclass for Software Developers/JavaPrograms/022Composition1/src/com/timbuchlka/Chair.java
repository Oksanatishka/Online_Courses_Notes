package com.timbuchlka;

public class Chair {
    private String color;
    private int numberOfChairs;

    public Chair(String color, int numberOfChairs) {
        this.color = color;
        this.numberOfChairs = numberOfChairs;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }
}
