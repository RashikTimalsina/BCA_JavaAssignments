package com.rashiktimalsina.java_assignment.inheritance;

class Main
{

    public static void main(String[] args)
    {

        Car car=new Car();
        car.run();


        Bike bike=new Bike();
        bike.stop();


        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }



}