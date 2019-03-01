package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
//        boolean res = isEvenNumber(4);
//        System.out.println(res);
//        res = isEvenNumber(5);
//        System.out.println(res);

        int num = 0;
        int total = 0;
        while(num <12){
            num++;
            if (!isEvenNumber(num))
                continue;
            System.out.println(num);
            total++;
            if (total == 5)
                break;
        }
        System.out.println("Total number os even numbers is " + total);
    }
    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0)
            return true;
        return false;
    }
}
