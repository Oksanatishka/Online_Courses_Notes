package com.timbuchlka;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // 3rd constructor
    public VipCustomer(){
        this("Default name", 2000, "default@default.com");
//        System.out.println("Constructor was called");
    }

    // 2nd constructor
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "test@test.com");
    }

    // 1st constructor
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
