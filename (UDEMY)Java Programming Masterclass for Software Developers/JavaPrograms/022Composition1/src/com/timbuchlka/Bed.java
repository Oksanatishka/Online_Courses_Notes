package com.timbuchlka;

public class Bed {
    private int placesPerBed;
    private String color;

    public Bed(int placesPerBed, String color) {
        this.placesPerBed = placesPerBed;
        this.color = color;
    }

    public int getPlacesPerBed() {
        return placesPerBed;
    }

    public String getColor() {
        return color;
    }
}
