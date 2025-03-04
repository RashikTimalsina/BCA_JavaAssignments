package com.rashiktimalsina.java_assignment.methodoverriding;

class Main
{


    public static void main(String[] args)
    {

        NRB r=new NRB();
        NIC c=new NIC();



        System.out.println("Rate of Interest for Nepal Rastrya Bank : " +r.getInterest());
        System.out.println("Rate of Interest for NIC Asia Bank : " +c.getInterest());


    }



}

