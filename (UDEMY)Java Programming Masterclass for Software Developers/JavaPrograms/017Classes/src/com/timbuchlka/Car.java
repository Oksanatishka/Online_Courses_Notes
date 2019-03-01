package com.timbuchlka;

public class Car {

    // fields
    private int doors;
    private int wheels;
//    public String model;  --> we will create a public method to make encapsulation
    private String model;
    private String engine;
    private String color;

    // standard methods
    // 1. setter
    public void setModel(String model){
        // this.model = model; // "this.model" --> is referred to fields. "= model" --> is referred to parameter.

        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    // 2. getter
    public String getModel() {
        return this.model;
    }
}
