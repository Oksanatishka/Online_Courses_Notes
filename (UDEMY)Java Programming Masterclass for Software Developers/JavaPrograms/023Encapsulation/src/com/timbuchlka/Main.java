package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(59, true);
        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
//        printer.fillUpToner();
//        printer.getTonerLevel();
//        printer.printPage();
        int pagesPrinted = printer.printPage(4);
        System.out.println("PAge printed was " + pagesPrinted + ", new total = " + printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.printPage(2);
        System.out.println("PAge printed was " + pagesPrinted + ", new total = " + printer.getNumberOfPagesPrinted());

    }
}
