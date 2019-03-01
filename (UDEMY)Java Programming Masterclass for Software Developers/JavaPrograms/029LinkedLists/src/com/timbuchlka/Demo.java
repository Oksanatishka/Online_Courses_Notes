package com.timbuchlka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Mayami");
//        placesToVisit.add("Atlanta");
//        placesToVisit.add("New York");
//        placesToVisit.add("Seatle");
//        placesToVisit.add("Portland");
//        placesToVisit.add("San Francisco");
//
//        printLinkedList(placesToVisit);
//
//        placesToVisit.add(1, "SALT LAKE CITY");
//        printLinkedList(placesToVisit);


        addInOrder(placesToVisit, "City 1");
        addInOrder(placesToVisit, "City 3");
        addInOrder(placesToVisit, "City 2");
        addInOrder(placesToVisit, "City 5");
        addInOrder(placesToVisit, "City 4");
        printLinkedList(placesToVisit);

        addInOrder(placesToVisit, "City 4");
        printLinkedList(placesToVisit);
        visit(placesToVisit);
    }
    private static void printLinkedList(LinkedList<String> linkedList){
        // iterating through the linked list
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("now visiting " + i.next());
        }
        System.out.println("=================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal, don't add
                System.out.println(newCity + " already added as destination");
                return false;
            } else if (comparison > 0){
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0){
                // move on next city
            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.getFirst() == ""){
            System.out.println("No cities");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting "+ listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Available menu options, press: ");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu");
    }
}
