package com.rashiktimalsina.java_assignment.collectionslab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program to demonstrate. Use of List to store duplicate values. Use of Set to store unique values.Print both collections.

public class ListSetDemo {
    public static void main(String[] args) {
        List<String> lcars=new ArrayList<>();
        lcars.add("BMW");
        lcars.add("Lambo");
        lcars.add("Rolls Royce");
        lcars.add("Supra");             //Duplicate
        lcars.add("Ferrari");
        lcars.add("Tesla");
        lcars.add("Supra");              //Duplicate

        Set<String> scars=new HashSet<>(lcars);
        System.out.println("List contents: ");

        for(String l:lcars) {
            System.out.println(l);
        }

        System.out.println("----------------------");

        System.out.println("Set contents: ");

        for(String s:scars) {
            System.out.println(s);
        }
    }
}
