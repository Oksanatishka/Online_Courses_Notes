package com.timbuchlka;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
	// write your code here
        int choice = 0;
        boolean quit = false;
        startPhone();
        printInstructions();

        while(!quit){
            System.out.println("Enter your choice (0 to show available actions): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
            }
        }

    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printInstructions(){
        System.out.println("Press ");
        System.out.println("\t 0 - To print instructions");
        System.out.println("\t 1 - To print contacts");
        System.out.println("\t 2 - To add contact");
        System.out.println("\t 3 - To update contact");
        System.out.println("\t 4 - To remove contact");
        System.out.println("\t 5 - query if an existing phone exists");
        System.out.println("\t 6 - To shutdown");

        System.out.println("Choose your action: ");
    }


    private static void addContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();

        System.out.println("Enter contact phone: ");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: name = " + name + " phone = " + phone);
        } else {
            System.out.println("Can't add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone ");
        String newPhone = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newPhone);
        if (mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated");
        } else {
            System.out.println("Error updating record");
        }

    }

    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhone());
    }
}
