package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
        for(int i=2; i<9; i++){
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("*********************");
        for(int i=8; i>1; i--){
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("*********************");

        // prime numbers
        int count = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i)) {
                count++;
                System.out.println(i);
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("*********************");

        // Sum 3 and 5 Challenge
        int count1 = 0;
        int sum = 0;
        for(int i=1;i<=1000;i++){
            if((i%3==0) && (i%5==0)){
                count1++;
                sum = sum + i;
                System.out.println(i);
            }
            if (count1 ==5)
                break;
        }
        System.out.println("Sum is " +sum);

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    // prime numbers

    public static boolean isPrime(int n){
        if (n == 1)
            return false;
        for (int i = 2; i <n/2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
