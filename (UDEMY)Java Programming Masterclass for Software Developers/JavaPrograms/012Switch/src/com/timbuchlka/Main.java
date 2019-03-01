package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
	    int val = 2;
        if (val == 1)
            System.out.println("It's 1.");
        else if (val == 2)
            System.out.println("It's 2.");
        else
            System.out.println("It's not 1 or 2.");


        int value = 3;
        switch (value){
            case 1:
                System.out.println("it's 1");
                break;
            case 2:
                System.out.println("it's 2");
                break;

            default:
                System.out.println("it's not 1 or 2");
                break;

        }

        // Challenge
        char myChar='E';
        switch(myChar) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(myChar + " was found");
                break;

            default:
                System.out.println("Not found");
                break;
        }

        // Switch with String type
        String month="JANUARY";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;

            default:
                System.out.println("Not sure");
                break;
        }

        printDayOfTheWeek(8);
        printDayOfTheWeek(4);
    }

    // Day of the Week Challenge
    public static void printDayOfTheWeek(int day) {
//        switch(day){
//            case 0:
//                System.out.println("Monday");
//                break;
//            case 1:
//                System.out.println("Tuesday");
//                break;
//            case 2:
//                System.out.println("Wednesday");
//                break;
//            case 3:
//                System.out.println("Thursday");
//                break;
//            case 4:
//                System.out.println("Friday");
//                break;
//            case 5:
//                System.out.println("Saturday");
//                break;
//            case 6:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid Day");
//                break;
//        }


        if (day == 0)
            System.out.println("Monday");
        else if (day == 1)
            System.out.println("Tuesday");
        else if (day == 2)
            System.out.println("Wednesday");
        else if (day == 3)
            System.out.println("Thursday");
        else if (day == 4)
            System.out.println("Friday");
        else if (day == 5)
            System.out.println("Saturday");
        else if (day == 6)
            System.out.println("Sunday");
        else
            System.out.println("Invalid Day");
    }
}
