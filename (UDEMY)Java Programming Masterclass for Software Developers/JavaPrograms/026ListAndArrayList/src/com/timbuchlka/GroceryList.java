package com.timbuchlka;

import java.util.ArrayList;

public class GroceryList {
//    private int[] myNumber = new int[50];     // array
//    myNumber[1] = 4;                          // adding element to array


    private ArrayList<String> groceryList = new ArrayList<String>();    // ArrayList (it's a built-in class) with elements of type String)

    // add()
    public void addGroceryItem(String item){
        groceryList.add(item);                                          // adding element to ArrayList
    }
    // size(), get()
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");    // size() returns how many elements you have
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));      // get() accesses particular element
        }
    }

    // replacing/updating item
    // set()
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void modifyGroceryItem(String newItem){
        int position = findItem(newItem);
        if (position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }

    // removing item
    // remove()
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    // find item
//    public String findItem(String searchItem){
//        // you can do it manually using for loop OR using contains()
////        boolean exists = groceryList.contains(searchItem);      // true if found
//
//        //first solution
//
//        int position = groceryList.indexOf(searchItem); // indexOf() returns index position
//        if (position >= 0 )
//            return groceryList.get(position);
//        return null; // means we are unable to find
//
//
//    }

    public int findItem(String searchItem){
        // another solution
        return groceryList.indexOf(searchItem);
    }
}
