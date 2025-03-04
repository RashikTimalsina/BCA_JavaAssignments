package com.rashiktimalsina.java_assignment.superkeyword;
class Animal					//Parent Class
{

    String color="white";				//Parent body

}


class Cat extends Animal
{

    String color="black";

    void printColor()
    {

        System.out.println(color);

        System.out.println(super.color);
    }

}


class Main
{


    public static void main(String [] args)
    {


        Animal animal=new Animal();
        Cat cat=new Cat();


        cat.printColor();


    }




}
