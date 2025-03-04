package com.rashiktimalsina.java_assignment.objectusage;
class Car {

    String model;
    String color;



    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();


        myCar.color = "Red";
        myCar.model = "Tesla";


        myCar.displayDetails();
    }
}