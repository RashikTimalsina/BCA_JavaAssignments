package com.rashiktimalsina.java_assignment.interfaceusage;


interface Father {

    String name="Ram";
    void demoFather();     //No body

}

interface Mother {

    String name= "Sita";
    void demoMother();    //No body
}
 class Child implements Father, Mother{
    public void demoFather(){
        System.out.println(Father.name + " is a father");
    }

    public void demoMother(){
        System.out.println(Mother.name + " is a mother");
    }
}


public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        child.demoFather();
        child.demoMother();
    }
}
