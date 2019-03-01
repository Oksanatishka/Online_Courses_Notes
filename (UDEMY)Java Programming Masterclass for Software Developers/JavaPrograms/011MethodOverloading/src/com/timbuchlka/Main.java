package com.timbuchlka;

public class Main {
    // constant
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(2,1);
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(-10,1);
        calcFeetAndInchesToCentimeters(6,-10);

        calcFeetAndInchesToCentimeters(2);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(-10);

        // Seconds And Minutes Challenge

        System.out.println(getDurationString(180, 45));
        System.out.println(getDurationString(30, -45));
        System.out.println(getDurationString(30, 45));
        System.out.println(getDurationString(61, 0));

        System.out.println(getDurationString(893600));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(50));
        System.out.println(getDurationString(-30));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameter.");
            return -1;
        }
//        return (inches * 2.54d + feet * 12 * 2.54d);
        System.out.println(inches * 2.54d + feet * 12 * 2.54d);
        return 1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
//        System.out.println(inches * 12);
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(feet + " feet " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


    // Seconds And Minutes Challenge

    public static String getDurationString(int minutes, int seconds){
        if (minutes< 0 || (seconds < 0 || seconds > 60)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        String addZeroToHour = "";
        String addZeroToMin = "";
        String addZeroToSec = "";
        if (hours < 10)
             addZeroToHour = "0";
        if (minutes < 10)
            addZeroToMin = "0";
        if (seconds < 10)
            addZeroToSec = "0";

        return addZeroToHour + hours + "h " + addZeroToMin + minutes + "m " + addZeroToSec + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int calcMinutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(calcMinutes, seconds);
    }
}
