package com.rashiktimalsina.java_assignment.methodoverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.add(5, 6, 7));
        System.out.println(calculator.add(5.4, 3.2));

    }
}