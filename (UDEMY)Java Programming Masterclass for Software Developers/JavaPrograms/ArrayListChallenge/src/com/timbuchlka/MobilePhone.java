package com.timbuchlka;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

//    public void storeContacts(){
//        System.out.println("You have "  + contactList.size() + "contacts.");
//        for (int i = 0; i < contactList.size(); i++)
//            System.out.println(contactList.get(i));
//    }

    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    public int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }

    public int findContact(String contactName){
        for(int i =0 ; i< this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName))
                return i;
        }
        return -1;
    }


    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }

        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);

        if (position >=0){
            return this.myContact.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for (int i =0; i<this.myContact.size();i++){
            System.out.println((i+1) + "." +
                    this.myContact.get(i).getName() + " --> " +
                    this.myContact.get(i).getPhone());
        }
    }
}
