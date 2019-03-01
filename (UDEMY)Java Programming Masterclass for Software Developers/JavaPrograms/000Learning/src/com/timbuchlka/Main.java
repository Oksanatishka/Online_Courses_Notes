package com.timbuchlka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner
        // -------- Java Exceptions - Try...Catch --------
        try {
            int[] myArr = {2,35,56};
            System.out.println(myArr[10]); // OUTPUT: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        }
        catch (Exception e){
            throw new SecurityException("Access denied");
//            System.out.println("Error in the code");    // OUTPUT:  Error in the code
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }





    }
}
