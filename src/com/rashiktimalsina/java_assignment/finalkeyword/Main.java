package com.rashiktimalsina.java_assignment.finalkeyword;

final class Animal {
    //Cannot be overriden
    final void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();
    }
}