package com.rashiktimalsina.java_assignment.abstraction;
abstract class Animal {

    abstract void makeSound();


    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}