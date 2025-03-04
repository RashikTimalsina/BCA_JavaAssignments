package com.rashiktimalsina.java_assignment.encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();


        p1.setName("Rashik Timalsina");
        p1.setAge(20);


        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
