package com.timbuchlka;

import java.util.ArrayList;

class intClass{
    private int myVal;

    public intClass(int myVal) {
        this.myVal = myVal;
    }

    public int getMyVal() {
        return myVal;
    }

    public void setMyVal(int myVal) {
        this.myVal = myVal;
    }
}

public class Main {

    public static void main(String[] args) {
        // Array
	    int[] intArray = new int[10];
	    String[] strArr = new String[19];

	    // ArrayList
//        ArrayList<int> intArrList = new ArrayList<int>();     // error because int is a primitive type not class
        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        intArrList.add(34);

        ArrayList<intClass> inArrList1 = new ArrayList<intClass>();
        inArrList1.add(new intClass(54));


//        int i =0 ;
//        inArrList1.add(Integer.valueOf(i)); // converting int to Integer

        Integer myIntValue = 54;    // Integer.valueOf(54);
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double i=0.0; i<=10.0;i+=0.5){
            myDoubleValues.add(i);
        }
        for (int i=0;i<myDoubleValues.size();i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i+" -->" + value);
        }
    }
}
