package com.timbuchlka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] myArr = {5,4,3,2,1};
        int[] myArr = {1, 5, 3, 7, 11, 9, 15};

        System.out.println("Before reverse: " + Arrays.toString(myArr));
        reverse(myArr);
        System.out.println("After reverse: " + Arrays.toString(myArr));
    }
    private static void reverse(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length/2;
        for(int i =0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex-i]= temp;
        }
    }
}

