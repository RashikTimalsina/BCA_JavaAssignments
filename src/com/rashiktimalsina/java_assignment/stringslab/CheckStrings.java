package com.rashiktimalsina.java_assignment.stringslab;

import java.util.Scanner;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program that checks if two given strings are equal (case-insensitive), and prints "Equal" or "Not Equal".

public class CheckStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if equal ignoring the case sensitivity
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        scanner.close();
    }
}
