package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Table theTable = new Table("white", "wood");

        Chair theChair = new Chair("red", 4);
        Bed theBed = new Bed(2,"brown");

        Room room = new Room(theBed, theTable, theChair);
        room.getBed();
        room.getChair();
        room.getTable().hide();
        room.getTable().show();
    }
}
