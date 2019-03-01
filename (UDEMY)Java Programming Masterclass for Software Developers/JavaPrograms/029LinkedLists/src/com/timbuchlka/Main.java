package com.timbuchlka;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        // with a traditional array you'd have to move all other elements down to make room for that
        // but with linked lists it's easier: we pointing new element to the next one
        intList.add(1,2); // to add 2 after 1
        for (int i=0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        // Linked Lists are alternative to arrays, it stores link to the next item & data


    }
}
