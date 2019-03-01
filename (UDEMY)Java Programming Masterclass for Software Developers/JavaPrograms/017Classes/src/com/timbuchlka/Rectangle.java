package com.timbuchlka;

// Good example of Constructors

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // This is known as constructor chaining, the last constructor has the
    // 'responsibility' to initialize the variables.

    // 1st constructor
    public Rectangle(){
        this(0,0); // calls the 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int width, int height){
        this(0,0,width,height); // calls the 3rd constructor
    }

    // 3rd constructor  - initializes the instance variables
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

// Bad example of Constructors - code dublication
//
//public class Rectangle {
//    private int x;
//    private int y;
//    private int width;
//    private int height;
//
//    // 1st constructor
//    public Rectangle(){
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }

//    // 2nd constructor
//    public Rectangle(int width, int height){
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }
//
//    // 3rd constructor
//    public Rectangle(int x, int y, int width, int height) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }
//}