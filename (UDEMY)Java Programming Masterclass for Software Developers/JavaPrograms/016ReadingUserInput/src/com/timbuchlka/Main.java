package com.timbuchlka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Reading user input

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if(hasNextInt) {
//            int year = scanner.nextInt();
//            scanner.nextLine(); // to handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2019 - year;
//
//            if (age >=0 && age<=100)
//                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//            else
//                System.out.println("Invalid year of birth.");
//
//        } else {
//            System.out.println("Unable to parse year of birth.");
//        }
//
//        scanner.close();    // to release memory

        // *****************************************************
        // *****************************************************
        // *****************************************************

        // Challenge

//        Scanner scanner1 = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter number #" + i);
//            boolean isAnInt = scanner1.hasNextInt();
//            if (isAnInt) {
//                int number = scanner1.nextInt();
//                sum += number;
//            } else {
//                System.out.println("Invalid Number");
//                i--;
//            }
//            scanner1.nextLine();
//        }
//        System.out.println("The sum is " + sum);
//        scanner1.close();   // handle end of line (enter key)

        // *****************************************************
        // *****************************************************
        // *****************************************************

        // Minimum And Maximum Challenge

        Scanner scanner2 = new Scanner(System.in);

//        int counter = 0;
//        int min = 0;
//        int max = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(true) {
//            System.out.println("Enter number #" + counter + ":");
            System.out.println("Enter number:");

            boolean isAnInt = scanner2.hasNextInt();
            if (isAnInt){
                int number = scanner2.nextInt();

//                if (counter == 0) {
//                    max = number;
//                    min = number;
//                } else {
                    if (number > max)
                        max = number;
                    if (number < min)
                        min = number;
//                }
//                counter++;
            } else
                break;

            scanner2.nextLine();
        }

        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);

        scanner2.close();
    }
}
