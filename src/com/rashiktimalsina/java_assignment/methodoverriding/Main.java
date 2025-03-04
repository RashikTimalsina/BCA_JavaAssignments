package com.rashiktimalsina.java_assignment.methodoverriding;


class Bank						//Parent Class
{

    int getInterest()
    {

        return 0;

    }


}

class NIC extends Bank
{

    int getInterest()
    {

        return 8;

    }

}



class NRB extends Bank
{

    int getInterest()
    {

        return 5;

    }


}



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

