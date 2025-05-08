package com.rashiktimalsina.java_assignment.collectionslab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program that stores a group of names in both HashSet and TreeSet, and prints the result to show the difference in ordering.

public class SetComparision {
    public static void main(String[] args) {
        String[] arr={"John","Ram", "Rashik", "Sush", "Ram", "John"};

        Set<String> hashSet=new HashSet<>(Arrays.asList(arr));

        Set<String> treeSet=new TreeSet<>(Arrays.asList(arr));

        System.out.println("\nHashSet contents : ");
        for (String a : hashSet) {
            System.out.println("- " + a);
        }

        System.out.println("\nTreeSet contents : ");
        for (String a : treeSet) {
            System.out.println("- " + a);
        }

    }
}
