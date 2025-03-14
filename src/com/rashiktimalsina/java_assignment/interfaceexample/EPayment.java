package com.rashiktimalsina.java_assignment.interfaceexample;

public class EPayment implements Payment {

     double commission=20.00;

   @Override
    public double pay(double amount) {
       System.out.println("Esewa Payment : " + amount);
        return amount + commission;

   }


}
