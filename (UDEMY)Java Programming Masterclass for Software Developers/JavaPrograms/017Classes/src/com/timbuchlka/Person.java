package com.timbuchlka;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        if (age < 0 || age > 100)
            return 0;
        return this.age;
    }

    public boolean isTeen(){
        if(this.age > 12 && this.age < 20 )
            return true;
        return false;
    }
    public String getFullName(){
        if (this.firstName.isEmpty() == true && this.lastName.isEmpty() == true)
            return "";
        else if (this.lastName.isEmpty() == true)
            return firstName;
        else if (this.firstName.isEmpty() == true)
            return lastName;
        else
            return firstName + " " + lastName;
    }
}
