package com.timbuchlka;

public class Point {
    private int x;
    private int y;

    public Point(){
//        System.out.println("Constructor was called");
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double res = (double) (0 - this.x)* (0 - this.x) + (double) (0 - this.y)* (0 - this.y);
        return Math.sqrt(res);
    }

    public double distance(int x, int y){
        double res = (double) (x - this.x)* (x - this.x) + (double) (y - this.y)* (y - this.y);
        return Math.sqrt(res);
    }

    public double distance(Point another){
        double res = (double) (another.x - this.x)* (another.x - this.x) + (double) (another.y - this.y)* (another.y - this.y);
        return Math.sqrt(res);
    }
}
