package com.rashiktimalsina.java_assignment.collectionslab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program that stores 5 integers using an ArrayList, sorts them in ascending order using Collections.sort(), and displays the result.

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers);

        System.out.println("\nSorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();

    }
}
