package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "2018";
        System.out.println(myString);

        // Integer is a class, parseInt is a method
        int intFromString = Integer.parseInt(myString);
        System.out.println(intFromString);

        // Double is a class
        double doubleFromString = Double.parseDouble(myString);
        System.out.println(doubleFromString);

        myString += 1;
        intFromString += 1;

        System.out.println(myString);   // plus used in String will concatenate
        System.out.println(intFromString);  // plus in Number will add
    }
}
