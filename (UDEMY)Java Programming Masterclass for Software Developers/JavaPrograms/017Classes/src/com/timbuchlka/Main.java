package com.timbuchlka;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();        // "= new Car(); --> is initialization (create an object)
        Car holden = new Car();

//        System.out.println("Model is " + porsche.getModel());   // null
//	    porsche.model = "Carrera";      // we are not going to use field
        porsche.setModel("Carrera1");    // using method
        porsche.setModel("Carrera");    // using method

        System.out.println("Model is " + porsche.getModel());


        System.out.println("********* Sum Calculator ***********");
        // Sum Calculator Challenge

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());


        System.out.println("********* Person ***********");
        // Person Challenge

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


        System.out.println("********* Bank Account ***********");
        // BankAccount Challenge
        BankAccount myAccount = new BankAccount();
//        BankAccount myAccount = new BankAccount()("123456", 1500.45,"Tom Kravez", "tom45@gmail.com", "912345122");
        myAccount.withdrawal(700);
//        myAccount.setAccountNumber("123456");
//        myAccount.setBalance(1500.45);
//        myAccount.setCustomerName("Tom Kravez");
//        myAccount.setCustomerEmail("tom45@gmail.com");
//        myAccount.setCustomerNumber("912345122");

        myAccount.withdrawal(700);
        myAccount.deposit(4000);

        BankAccount timsAccount = new BankAccount("Tim", "tims@test.com", "4545");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());


        System.out.println("********* VipCustomer ***********");
        // VipCustomer Challenge
        VipCustomer tim = new VipCustomer();
        System.out.println(tim.getName());

        VipCustomer person1 = new VipCustomer("timname", 34, "tim@jj.com");
        System.out.println(person1.getCreditLimit());

        VipCustomer person2 = new VipCustomer("timname", 34);
        System.out.println(person2.getEmail());

        System.out.println("********* Wall Area ***********");
        // Wall Area Challenge
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());


        System.out.println("********* Point ***********");
        // Point Challenge
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        System.out.println("********* Carpet Cost Calculator ***********");
        // Carpet Cost Calculator Challenge
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost());


        System.out.println("********* Complex Operations ***********");
        // Complex Operations Challenge
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
