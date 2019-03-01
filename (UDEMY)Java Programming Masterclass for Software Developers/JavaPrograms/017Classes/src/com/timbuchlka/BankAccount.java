package com.timbuchlka;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

    //constructor
    public BankAccount(){
        this("1234", 2.50, "Default name", "Default email", "default number");
        System.out.println("Constructor was called.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerNumber){
        System.out.println("Constructor with parameters was called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerNumber = customerNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerNumber) {
        this("999999", 100.55, customerName, customerEmail, customerNumber);
    }

    // setters
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    // additional setters
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawAmount){
        if (this.balance - withdrawAmount < 0)
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " was processed. Remaining balance = " + this.balance);
        }
    }

    // getters
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public String getCustomerNumber(){
        return this.customerNumber;
    }
}
