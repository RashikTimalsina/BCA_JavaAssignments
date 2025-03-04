package com.rashiktimalsina.java_assignment.inheritance;

class Vehicle
{

    double speed;

    void run()
    {

        System.out.println("The Vehicle is running ");

    }


    void stop()
    {

        System.out.println("The Vehicle is stopped ");

    }

}



class Car extends Vehicle
{

    int doors=4;


}



class Bike extends Vehicle
{

    int pedals=2;


}

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