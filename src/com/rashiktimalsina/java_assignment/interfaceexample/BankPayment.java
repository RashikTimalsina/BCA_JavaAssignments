package com.rashiktimalsina.java_assignment.interfaceexample;

public class BankPayment implements Payment {

    double commission=10;

    @Override
    public double pay(double amount) {
       System.out.println("Bank Payment : " +amount);
        return amount + commission;


    }



}

