package com.rashiktimalsina.java_assignment.interfaceusage;

public class Child implements Father,Mother{
    public void demoFather(){
        System.out.println(Father.name + " is a father");
    }

    public void demoMother(){
        System.out.println(Mother.name + " is a mother");
    }
}
