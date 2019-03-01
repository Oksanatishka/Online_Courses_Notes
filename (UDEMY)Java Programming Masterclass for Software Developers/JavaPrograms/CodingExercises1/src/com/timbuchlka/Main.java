package com.timbuchlka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 28. Input Calculator
//        inputThenPrintSumAndAverage();

        // 29. Paint Job
        int res1 = getBucketCount(-3.4, 2.1, 1.5, 2);  // -1
        System.out.println(res1);
        res1 = getBucketCount(3.4, 2.1, 1.5, 2);   // 3
        System.out.println(res1);
        res1 = getBucketCount(2.75, 3.25, 2.5, 1); // 3
        System.out.println(res1);
        System.out.println("**************************");
        res1 = getBucketCount(-3.4, 2.1, 1.5);     // -1
        System.out.println(res1);
        res1 = getBucketCount(3.4, 2.1, 1.5);      // 5
        System.out.println(res1);
        res1 = getBucketCount(7.25, 4.3, 2.35);    // 14
        System.out.println(res1);
        System.out.println("**************************");
        res1 = getBucketCount(3.4, 1.5);   // 3
        System.out.println(res1);
        res1 = getBucketCount(6.26, 2.2);  // 3
        System.out.println(res1);
        res1 = getBucketCount(3.26, 0.75); // 5
        System.out.println(res1);
        System.out.println("**************************");
    }

    // 28. Input Calculator

//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        double avg = 0;
//        int counter = 1;
//
//        while(true){
//            boolean isAnInt = scanner.hasNextInt();
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                sum += number;
//                avg = (double) sum / (double) counter;
//                counter++;
//            } else {
//                break;
//            }
//            scanner.nextLine();
//        }
//        long roundedAVG = Math.round(avg);
//        System.out.println("SUM = " + sum + " AVG = " + roundedAVG);
//
//        scanner.close();
//    }

    // 29. Paint Job

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width<= 0 || height <= 0 ||areaPerBucket <=0 || extraBuckets < 0)
            return -1;
        double wallArea = width * height;
        double numberOfBuckets = Math.ceil(wallArea / areaPerBucket) - extraBuckets;
        return (int)numberOfBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width<= 0 || height <= 0 ||areaPerBucket <=0 )
            return -1;
        double wallArea = width * height;
        double numberOfBuckets = Math.ceil(wallArea / areaPerBucket);
        return (int)numberOfBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area<= 0 ||areaPerBucket <=0)
            return -1;
        double numberOfBuckets = Math.ceil(area / areaPerBucket);
        return (int)numberOfBuckets;
    }




}