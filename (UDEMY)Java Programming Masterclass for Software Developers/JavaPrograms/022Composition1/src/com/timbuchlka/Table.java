package com.timbuchlka;

public class Table {
    private String color;
    private String material;

    public Table(String color, String material) {
        this.color = color;
        this.material = material;
    }

    // methods
    public void hide(){
        System.out.println("The table disappeared in the room.");
    }
    public void show(){
        System.out.println("The table appeared in the room.");
    }
    // getters
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
