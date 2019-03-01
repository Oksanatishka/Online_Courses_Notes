package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // DATA TYPES based on WHOLE NUMBERS (numbers that don't have decimal points)
        // 1. integer in a range -2.147 billion to +2.147 billion (min/max values stored in this data type)
        // int has a width of 32
        int myValue = 1000;
        int myValue1 = 1_000;
        System.out.println(myValue);
        System.out.println(myValue1);
        // int maxV = -2147999999; //large number won't work with int data type
        // literal | expression

        // 2. byte data type (in a range -128 to 127)
        // byte has a width of 8
        byte myByteVal = 10;
        byte myNewVal = (byte)(myByteVal/2);    // casting
        // If you don't specify the type it converts to integer

        // 3. short data type (-32768 to 32767)
        // short has a width of 16
        short myShortVal = 30000;
        short myNewShort = (short) (myShortVal/2);


        // 4. long has a width of 64
        // range 2 to the power of 63 (-9_223_372_036_854_775_808L to 9_223_372_036_854_775_807L)
        long myLongVal = 100L;



        // Challenge
        int myIntV = 2_146_999_999;
        byte myByteV = 126;
        short myShortV = 31_999;

        // you don't need casting below because it's made automatically for long
        long myLongV = 50_000L + 10L * (myByteV + myShortV + myIntV);
        System.out.println(myLongV);

        short myShortVV = (short) (1000 + 10 * (myByteV + myShortV + myIntV));
        System.out.println(myShortVV);
    }
}
