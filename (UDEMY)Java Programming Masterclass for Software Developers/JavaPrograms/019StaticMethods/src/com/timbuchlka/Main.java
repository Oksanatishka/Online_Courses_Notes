package com.timbuchlka;

class Calculator {
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
public class Main {

    public static void main(String[] args) {
        // static methods are called as ClassName.methodName(); or methodName(); only if in the same class
	    Calculator.printSum(5,10);  // static method
        printHello();                      // static method
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}
