package com.timbuchlka;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >=0 && tonerLevel <=100)
            this.tonerLevel = tonerLevel;
        else
            tonerLevel= -1;
        this.isDuplex = isDuplex;
        this.numberOfPagesPrinted = 0;

    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public double fillUpToner(int amount){
        if(amount>0 && amount <=100) {
            if (this.tonerLevel + amount > 100)
                return -1;
            this.tonerLevel += amount;
            return this.tonerLevel;
        }
        else
            return -1;
    }
    public int printPage(int pages){
        int pageToPrint = pages;
        if(this.isDuplex) {
            pageToPrint = (pages / 2) + (pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pageToPrint;
        return pageToPrint;
    }

}
