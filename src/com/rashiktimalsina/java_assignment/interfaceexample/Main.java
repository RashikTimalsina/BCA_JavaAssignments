package com.rashiktimalsina.java_assignment.interfaceexample;

public class Main{

    public static void main(String[] args) {

            Payment payment =new BankPayment();
            System.out.println("BankPayment after commission :" +payment.pay(500.00));



            payment =new EPayment();
            System.out.println("EsewaPayment after commission :" +payment.pay(600.00));
        }


    }

