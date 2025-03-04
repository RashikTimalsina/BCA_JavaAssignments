package com.rashiktimalsina.java_assignment.encapsulation;
class Person {

    private String name;
    private int age;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}




public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();


        p1.setName("Rashik Timalsina");
        p1.setAge(20);


        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
