package com.timbuchlka;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // defining array (1st way)
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//        myIntArray[6] = 50;
//        myIntArray[7] = 50;

        // defining array (2nd way)
//        int[] myIntArray = {1,2,3,3,4,5,6,7,7};
//        double[] myDoubleArray = new double[10];

        // defining array (3rd way)
        int[] myIntArray = new int[10];
//        for(int i =0; i<10; i++){
        for(int i =0; i<myIntArray.length; i++){
            myIntArray[i]= i*10;
            // retriving values
            // System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
        printArray(myIntArray);

        // retriving values
//        System.out.println(myIntArray[5]);

        System.out.println("---- Minimum Element Challenge ----- ");
        System.out.println("Enter number ");
        int count = scanner.nextInt();
        int[] returnedArray = readIntegers(count);
        int minNum = findMin(returnedArray);
        System.out.println("min value "+minNum);

//        System.out.println("My array is " + Arrays.toString(readIntegers(count)));
//        int[] arrtest = {34,3,7,5};
//        System.out.println("Min number is " + findMin(readIntegers(2)));
    }
    public static void printArray(int[] array){
        for(int i =0; i<array.length; i++){
            array[i]= i*10;
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    // Minimum Element Challenge
    private static Scanner scanner = new Scanner(System.in);
    private static int[] readIntegers(int count){
        System.out.println("Enter numbers:  ");
        int[] myArr = new int[count];
        for(int i=0; i<count;i++){
            myArr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myArr;
    }
    private static int findMin(int[] array ){
        int minNumber = array[0];
        for(int i=1; i<array.length; i++){
            if (minNumber > array[i] )
                minNumber = array[i];
        }
        return minNumber;
    }
}
