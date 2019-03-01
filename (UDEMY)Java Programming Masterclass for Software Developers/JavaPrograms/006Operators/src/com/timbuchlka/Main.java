package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Challenge
        double num1 = 20d;
        double num2 = 80d;
        double sum = (num1 + num2) * 25d;
        int rem = (int) (sum) % 40;
        if (rem <= 20)
            System.out.println("Total was over the limit.");
    }
}
