package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // width of int = 32 (4 bytes)
        int myInt = 5 / 3;
        // FLOATING POINTS NUMBERS

        // 1. float data type (has 7 numbers after point)
        // width of float = 32 (4 bytes)
        float myFloat = 5f / 3f;
        float myFloat1 = (float) 5.45; // or 5.45f;

        // 2. double data type (has 16 numbers after point - more precise)
        // width of double = 64 (8 bytes)
        // double is faster on modern computers
        double myDouble = 5d / 3d;

        System.out.println("My int value: " + myInt);
        System.out.println("My float value: " + myFloat);
        System.out.println("My double value: " + myDouble);


        // Challenge
        // Convert a given number of pounds to kg

        double pounds = 3d;
        double kilograms = pounds * 0.45359237d;
        System.out.println("kg equals: " + kilograms);

        double pi = 3_000_000.141_592_7d;
    }
}
