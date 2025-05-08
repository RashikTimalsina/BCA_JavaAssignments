package com.rashiktimalsina.java_assignment.stringslab;

import java.util.Scanner;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program to input two strings from the user, concatenate them, convert the result to uppercase, and display it.

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String concatString = firstString + secondString;

        String upperCaseString = concatString.toUpperCase();

        System.out.println("Concatenated and Uppercase Result: " + upperCaseString);

        scanner.close();

    }
}
