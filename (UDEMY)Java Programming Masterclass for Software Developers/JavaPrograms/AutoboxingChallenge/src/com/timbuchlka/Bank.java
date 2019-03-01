package com.timbuchlka;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

//public class Bank {
//    private String name;
//    private ArrayList<Branch> listOfBranches;
//
//    public Bank(String name) {
//        this.name = name;
//        this.listOfBranches = new ArrayList<Branch>();
//    }
//
//    public boolean addBranch(String branchName){
//        if(findBranch(branchName) == null){
//            this.listOfBranches.add(new Branch(branchName));
//            return true;
//        }
//        return false;
//    }
//
//    public boolean addCustomer(String branchName, String customerName, double initialAmount){
//        if(findBranch(branchName) != null){
//            return findBranch(branchName).newCustomer(customerName, initialAmount);
//        }
//        return false;
//    }
//
//    public boolean addCustomerTransaction(String branchName, String customerName, double initialAmount){
//        if(findBranch(branchName) != null){
//            return findBranch(branchName).addTransaction(customerName, initialAmount);
//        }
//        return false;
//    }
//
//    public Branch findBranch(String branchName){
//        for(int i=0; i<this.listOfBranches.size();i++){
//            Branch checked = this.listOfBranches.get(i);
//            if(checked.getName().equals(branchName)){
//                return checked;
//            }
//        }
//        return null;
//    }
//
//    public boolean listCustomers(String branchName, boolean showTransactions){
//        Branch checked = findBranch(branchName);
//        if (checked != null){
//            System.out.println("Customers for branch " + checked.getName());
//
//            ArrayList<Customer> branchCustomers = checked.getListOfCustomers();
//            for (int i=0; i<branchCustomers.size();i++){
//                System.out.println("Customer: " + branchCustomers.get(i) + "[" + (i+1) + "]");
//                if (showTransactions){
//                    System.out.println("Transactions: ");
//                    ArrayList<Double> transactions = branchCustomers.get(i).getTransaction();
//                    for (int j =0; j<transactions.size();i++){
//                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j)) ;   // possible unboxing
//                    }
//                }
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//
//}
