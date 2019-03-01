package com.timbuchlka;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 4. Java Tutorial: Expressions, Statements, Code Blocks, Methods and more

        // 1. Speed Converter

        long res = toMilesPerHour(1.5);
        System.out.println(res);
        res = toMilesPerHour(10.25);
        System.out.println(res);
        res = toMilesPerHour(-5.6);
        System.out.println(res);
        res = toMilesPerHour(25.42);
        System.out.println(res);
        res = toMilesPerHour(75.114);
        System.out.println(res);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);

        // 2. Megabytes Converter
        System.out.println("\n");
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        // 3. Barking Dog Method
        System.out.println("\n");
        boolean res3 = shouldWakeUp(true, 1);
        System.out.println(res);
        res3 = shouldWakeUp(false, 2);
        System.out.println(res);
        res3 = shouldWakeUp(true, 8);
        System.out.println(res);
        res3 = shouldWakeUp(true, -1);
        System.out.println(res);

        // 4. Yeap Year Calculator
        System.out.println("\n");
        boolean res4 = isLeapYear(-1600);
        System.out.println(res4);
        res4 = isLeapYear(1600);
        System.out.println(res4);
        res4 = isLeapYear(2017);
        System.out.println(res4);
        res4 = isLeapYear(2000);
        System.out.println(res4);
        res4 = isLeapYear(1924);
        System.out.println(res4);

        // 5. DecimalComparator
        System.out.println("\n");
        boolean res5 = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(res5);
        res5 = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(res5);
        res5 = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(res5);
        res5 = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(res5);

        // 6. Equal Sum Checker
        System.out.println("\n");
        boolean res6 = hasEqualSum(1,1,1);
        System.out.println(res6);
        res6 = hasEqualSum(1,1,2);
        System.out.println(res6);
        res6 = hasEqualSum(1,-1,0);
        System.out.println(res6);

        // 7. Teen Number Checker
        System.out.println("\n");
        boolean res7 = hasTeen(9,99,19);
        System.out.println(res7);
        res7 = hasTeen(23,15,42);
        System.out.println(res7);
        res7 = hasTeen(22,23,34);
        System.out.println(res7);

        // METHOD OVERLOADING

        // 8. Area Calculator
        System.out.println("\n");
        double res8 = area(3);
        System.out.println(res8);

        res8 = area(5.0);  // should return 78.53975
        System.out.println(res8);
        res8 = area(-1);   // should return -1 since the parameter is negative
        System.out.println(res8);
        res8 = area(5.0, 4.0);     // should return 20.0 (5 * 4 = 20)
        System.out.println(res8);
        res8 = area(-1.0, 4.0);     // should return -1 since first the parameter is negative
        System.out.println(res8);

        // 9. Minutes to Years and Days Calculator
        System.out.println("\n");
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(1440);
        printYearsAndDays(-525600);

        // 10. Equality Printer
        System.out.println("\n");
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(1,2,1);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

        // 11. Playing Cat
        System.out.println("\n");
        boolean res11 = isCatPlaying(true, 56);
        System.out.println(res11);
        res11 = isCatPlaying(false, 45);
        System.out.println(res11);
        res11 = isCatPlaying(true, 35);
        System.out.println(res11);

        System.out.println("****************");
        // 14. Sum Odd
        int res14 = sumOdd(1,100);
        System.out.println(res14);
        res14 = sumOdd(-1,100);
        System.out.println(res14);
        res14 = sumOdd(100,100);
        System.out.println(res14);
        res14 = sumOdd(100,-100);
        System.out.println(res14);
        res14 = sumOdd(100,1000);
        System.out.println(res14);

        System.out.println("****************");
        // 15. Digit Sum Challenge
        int res15 = sumDigits(234);
        System.out.println(res15);
        res15 = sumDigits(-234);
        System.out.println(res15);
        res15 = sumDigits(111);
        System.out.println(res15);

        System.out.println("****************");
        // 16. Number Palindrome
        boolean res16 = isPalindrome(1221);
        System.out.println(res16);
        res16 = isPalindrome(-1221);
        System.out.println(res16);
        res16 = isPalindrome(125621);
        System.out.println(res16);

        System.out.println("****************");
        // 17. First And Last Digit Sum
        int res17 = sumFirstAndLastDigit(1234);
        System.out.println(res17);
        res17 = sumFirstAndLastDigit(252);
        System.out.println(res17);
        res17 = sumFirstAndLastDigit(257);
        System.out.println(res17);
        res17 = sumFirstAndLastDigit(0);
        System.out.println(res17);
        res17 = sumFirstAndLastDigit(5);
        System.out.println(res17);
        res17 = sumFirstAndLastDigit(-10);
        System.out.println(res17);

        System.out.println("****************");
        // 18. Even Digit Sum
        int res18 = getEvenDigitSum(123456789);
        System.out.println(res18);
        res18 = getEvenDigitSum(252);
        System.out.println(res18);
        res18 = getEvenDigitSum(-22);
        System.out.println(res18);

        System.out.println("****************");
        // 19. Shared Digit
        boolean res19 = hasSharedDigit(12,23);
        System.out.println(res19);
        res19 = hasSharedDigit(9,99);
        System.out.println(res19);
        res19 = hasSharedDigit(15,55);
        System.out.println(res19);

        System.out.println("****************");
        // 20. Last Digit Checker
        boolean res20 = hasSameLastDigit(41, 22,71);
        System.out.println(res20);
        res20 = hasSameLastDigit(23, 32,42);
        System.out.println(res20);
        res20 = hasSameLastDigit(9, 99,999);
        System.out.println(res20);

        System.out.println("****************");
        // 21. Greatest Common Divisor
        int res21 = getGreatestCommonDivisor(25,15);
        System.out.println(res21);
        res21 = getGreatestCommonDivisor(12,30);
        System.out.println(res21);
        res21 = getGreatestCommonDivisor(9,18);
        System.out.println(res21);
        res21 = getGreatestCommonDivisor(81,153);
        System.out.println(res21);

        System.out.println("****************");
        // 22. All Factors
        printFactors(6);

        System.out.println("****************");
        // 23. Perfect Number
        boolean res23 = isPerfectNumber(6);
        System.out.println(res23);
        res23 = isPerfectNumber(28);
        System.out.println(res23);
        res23 = isPerfectNumber(5);
        System.out.println(res23);
        res23 = isPerfectNumber(-1);
        System.out.println(res23);

        System.out.println("****************");
        // 24. Number to Words
        System.out.println("-------numberToWords Method");
        numberToWords(0);
        System.out.println("-------");
        numberToWords(123);
        System.out.println("-------");
        numberToWords(1010);
        System.out.println("-------");
        numberToWords(1000);
        System.out.println("-------");
        numberToWords(-12);
        System.out.println("-------");
        numberToWords(10);

        System.out.println("-------getDigitCount Method");
        int res24get = getDigitCount(0);       // 1
        System.out.println(res24get);
        res24get = getDigitCount(123);     // 3
        System.out.println(res24get);
        res24get = getDigitCount(-12);     // -1
        System.out.println(res24get);
        res24get = getDigitCount(5200);    // 4
        System.out.println(res24get);

        System.out.println("-------reverse Method");
        int res24rev = reverse(-121);  // -121
        System.out.println(res24rev);
        res24rev = reverse(1212);  // 2121
        System.out.println(res24rev);
        res24rev = reverse(1234);  // 4321
        System.out.println(res24rev);
        res24rev = reverse(100);   // 1
        System.out.println(res24rev);

        System.out.println("****************");
        // 25. Flour Pack Problem
        boolean res25 = canPack(1,0,4);     //false
        System.out.println(res25);
        res25 = canPack(1,0,5);     //true
        System.out.println(res25);
        res25 = canPack(0,5,4);     //true
        System.out.println(res25);
        res25 = canPack(2,2,11);    //true
        System.out.println(res25);
        res25 = canPack(-3,2,12);   //false
        System.out.println(res25);
        res25 = canPack(5,3,24);   //false
        System.out.println(res25);
        res25 = canPack(2,1,5);   //true
        System.out.println(res25);
        res25 = canPack(2,2,12);   //true
        System.out.println(res25);

        System.out.println("**************** Largest Prime ************");
        // 26. Largest Prime
        System.out.println("The correct Result 7");
        int res26 = getLargestPrime(21);
        System.out.println(res26);
        System.out.println("The correct Result 31");
        res26 = getLargestPrime(217);
        System.out.println(res26);
        System.out.println("The correct Result -1");
        res26 = getLargestPrime(0);
        System.out.println(res26);
        System.out.println("The correct Result 5");
        res26 = getLargestPrime(45);
        System.out.println(res26);
        System.out.println("The correct Result -1");
        res26 = getLargestPrime(-1);
        System.out.println(res26);

        System.out.println("**************** Diagonal Star ************");
        // 27. Diagonal Star
        printSquareStar(5);
//        printSquareStar(2);
    }

    // 1. Speed Converter Method

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609d);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }


    // 2. Megabytes Converter Method

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }

    // 3. Barking Dog Method

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 && hourOfDay > 23)
            return false;
        else if (hourOfDay >= 0 && hourOfDay < 8 && barking == true)
            return true;
        else if (hourOfDay == 23 && barking == true)
            return true;
        else
            return false;
    }

    // 4. Yeap Year Calculator

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    // 5. DecimalComparator

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int result1 = (int)(num1 * 1000);
        int result2 = (int)(num2 * 1000);
        if (result1 == result2) {
            return true;
        }
        return false;
    }

    // 6. Equal Sum Checker

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if ((num1 + num2) == num3)
            return true;
        return false;
    }

    // 7. Teen Number Checker

    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 >=13 && num1 <= 19) || (num2 >=13 && num2 <= 19) || (num3 >=13 && num3 <= 19))
            return true;
        return false;
    }

    public static boolean isTeen(int num) {
        if (num >=13 && num <= 19)
            return true;
        return false;
    }

    // METHOD OVERLOADING

    // 8. Area Calculator

    public static double area(double radius) {
        if (radius < 0)
            return -1;
        return Math.PI * radius * radius;
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1;
        return x * y;
    }

    // 9. Minutes to Years and Days Calculator
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid Value");
        else {
            long years = minutes / (365 * 24 * 60);
            long days = (minutes % (365 * 24 * 60)) / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    // 10. Equality Printer
    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0)
            System.out.println("Invalid Value");
        else if (a == b && b == c && a == c) {
            System.out.println("All numbers are equal");
        }
        else if (a != b && b != c && a != c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }

    // 11. Playing Cat
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ( (summer && temperature >= 25 && temperature <=45) || (!summer && temperature >= 25 && temperature <=35))
            return true;
        return false;
    }


    // CONTROL FLOW STATEMENTS

    // 12. Number In Word
    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    // 13. Number Of Days In Month
    public static boolean isLeapYear1(int year){
        if (year < 1 || year > 9999)
            return false;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        else
            return false;
    }
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        if (month == 1 || month == 3 ||month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
            return 31;
        else if (month == 4 || month == 6 ||month == 9 || month == 11 )
            return 30;
        else {
            if (isLeapYear1(year))
                return 29;
            else
                return 28;
        }
    }


    // 14. Sum Odd
    public static boolean isOdd(int number){
        if(number<=0)
            return false;
        if(number % 2 != 0)
            return true;
        else
            return false;
    }
    public static int sumOdd(int start, int end){
        if (start>0 && end>0 && start<=end) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i))
                    sum = sum + i;
            }
            return sum;
        }
        else
            return -1;
    }


    // 15. Digit Sum Challenge
    public static int sumDigits(int number) {
        if (number <10)
            return -1;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;    // 121 --> digit = 1 --> digit = 2
            number = number / 10;       // number = 12 --> number = 1
            sum = sum + digit;
        }
        return sum;
    }

    // 16. Number Palindrome
    public static boolean isPalindrome(int number){
        if (number < 0)
            number = (-1)*number;
        int initialNumber = number;
        int reverseNumber = 0;
        while (number>0){
            int digit = number % 10;        // 1221 _ digit = 1 --> digit = 2
            reverseNumber = reverseNumber * 10 + digit;     // reverse = 1 --> 12
            number = number / 10;           // 122 --> 12
        }

        if(initialNumber == reverseNumber)
            return true;

        return false;
    }

    // 17. First And Last Digit Sum
    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;

        int lastNumber = number % 10;
        int sum = 0;
        while (number >9){
            int rem = number % 10; // 257 --> last = 7 --> 5
            number = number / 10; // 25 --> 2
        }
        sum = number + lastNumber;
        return sum;
    }

    // 18. Even Digit Sum
    public static int getEvenDigitSum(int number){
        if (number <0)
            return -1;
        int sum = 0;
        while(number > 0){
            int rem = number % 10;  // 1234 --> 4
            if (rem % 2 == 0)
                sum += rem;
            number = number / 10;
        }

        return sum;
    }

    // 19. Shared Digit
    public static boolean hasSharedDigit(int a, int b) {
        if (a <10 || a>99 || b <10 ||b>99)
            return false;
        int sharedDigit = 0;
        int a_lastDigit = a % 10;
        int b_lastDigit = b % 10;
        int a_firstDigit = a / 10;
        int b_firstDigit = b / 10;
        if ((a_lastDigit == b_lastDigit) || (a_lastDigit == b_firstDigit) || (a_firstDigit == b_lastDigit) || (a_firstDigit == b_firstDigit))
            return true;
        return false;
    }

    // 20. Last Digit Checker
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (a<10 || a>1000 || b <10 || b>1000 || c<10 || c>1000)
            return false;
        int a_lastDigit = a % 10;
        int b_lastDigit = b % 10;
        int c_lastDigit = c % 10;
        if (a_lastDigit == b_lastDigit || b_lastDigit == c_lastDigit || a_lastDigit == c_lastDigit)
            return true;
        return false;
    }
    public static boolean isValid(int num){
        if (num < 10 || num >1000)
            return false;
        return true;
    }

    // 21. Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10)
            return -1;
        int divisor = 1;
        for(int i=1; i< first; i++){
            if(first%i==0 && second%i==0)
                divisor = i;
        }
        return divisor;
    }

    // 22. All Factors
    public static void printFactors(int number){
        if (number<1)
            System.out.println("Invalid Value");
        for(int i=1; i<=number;i++) {
            if(number%i==0)
                System.out.println(i);
        }
    }

    // 23. Perfect Number
    public static boolean isPerfectNumber(int number){
        if (number<1)
            return false;
        int sum =0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum += i;
            }
        }
        if(sum == number)
            return true;
        return false;
    }

    // 24. Number to Words
    public static void numberToWords(int number){
        if(number<0) {
            System.out.println("Invalid Value");
        }
        int digitNumInitial = getDigitCount(number);   // 100 --> 3
        int reversedNum = reverse(number);      // 001 --> 1
        int digitNumReversed = getDigitCount(reversedNum); // 1

        if (reversedNum == 0)
            System.out.println("Zero");
        while (reversedNum >0){
            int lastDigit = reversedNum%10;
            if(lastDigit == 0)
                System.out.println("Zero");
            else if (lastDigit==1)
                System.out.println("One");
            else if (lastDigit==2)
                System.out.println("Two");
            else if (lastDigit==3)
                System.out.println("Three");
            else if (lastDigit==4)
                System.out.println("Four");
            else if (lastDigit==5)
                System.out.println("Five");
            else if (lastDigit==6)
                System.out.println("Six");
            else if (lastDigit==7)
                System.out.println("Seven");
            else if (lastDigit==8)
                System.out.println("Eight");
            else if (lastDigit==9)
                System.out.println("Nine");
            else
                System.out.println("Nonen a number");

            reversedNum = reversedNum / 10;
        }
        if (digitNumInitial != digitNumReversed){
            int diff = digitNumInitial - digitNumReversed;
            for(int i=0; i < diff; i++)
                System.out.println("Zero");
        }
    }
    public static int reverse(int num){
        boolean isNeg = false;
        if (num < 0)
            isNeg = true;
        if (isNeg == false) {
            int reverseNum=0;
            while(num>0){
                int rem = num % 10;   // 234 -->4 --> 3 -->
                reverseNum = reverseNum * 10 + rem;
                num = num/10;       // 23 -->2
            }
            return reverseNum;
        } else {
            num = (-1) * num;
            int reverseNum=0;
            while(num>0){
                int rem = num % 10;   // 234 -->4 --> 3 -->
                reverseNum = reverseNum * 10 + rem;
                num = num/10;       // 23 -->2
            }
            return reverseNum * (-1);
        }
    }
    public static int getDigitCount(int number){
        if (number < 0)
            return -1;
        int count = 0;
        if(number == 0)
            return 1;
        while (number > 0){
            int rem = number % 10;  // 1234 --> 4
            count += 1;
            number = number / 10;   // 123
        }
        return count;
    }

    // НЕ СМОГЛА РЕШИТЬ ЭТУ ЗАДАЧУ ЗА ТРИ ЧАСА САМОСТОЯТЕЛЬНО

    // 25. Flour Pack Problem
    public static boolean canPack(int bigCount, int smallCount, int goal){
        // bigCount  - big flour bags (5 kilos each).
        // smallCount - small flour bags (1 kilo each).
        // goal represents the goal amount of kilos of flour needed to assemble a package.

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int i = 1;
        for (i = 1; i <= bigCount; i++) {
            if (i * 5 > goal) {
                break;
            }
        }
        i = i - 1;
        goal = goal - (i * 5);

        if (goal == 0) {
            return true;
        }
        if (smallCount >= goal) {
            return true;
        }
        return false;
    }

    // НЕ СМОГЛА РЕШИТЬ ЭТУ ЗАДАЧУ ЗА ТРИ ЧАСА САМОСТОЯТЕЛЬНО

    // 26. Largest Prime
    public static int getLargestPrime(int number){  // 45

        int i;
        // 1 or 0 is not prime number
        if (number <= 1)
            return -1;

        for (i = 2; i<=number;i++){ //i<45
            if(number % i == 0) {   // 45 / 3
                number  /= i;       // 15
                i--;                // i = 2
            }                       // i = 3
        }

        return i;
    }


    // НЕ СМОГЛА РЕШИТЬ ЭТУ ЗАДАЧУ СРАЗУ

    // 27. Diagonal Star
    public static void printSquareStar(int number){
        if (number <5)
            System.out.println("Invalid Value");
        else {
            int countRow = number;
            int countColumn = number;
            String star = "*";
            for (int i = 1; i <= countRow; i++){
                for (int g = 1; g <= countColumn; g++){
                    if (g ==1 || g == countColumn || i ==1 || i==countRow || i==g || g==(countRow-i+1))
                        System.out.print(star);
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }







}
