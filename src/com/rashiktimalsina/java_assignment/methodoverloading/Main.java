package com.rashiktimalsina.java_assignment.methodoverloading;


class Calculator {
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
}


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.add(5, 6, 7));
        System.out.println(calculator.add(5.4, 3.2));

    }
}