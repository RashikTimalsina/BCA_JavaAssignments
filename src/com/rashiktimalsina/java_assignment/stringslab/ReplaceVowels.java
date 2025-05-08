package com.rashiktimalsina.java_assignment.stringslab;

import java.util.Scanner;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program to replace all vowels in a string with * and print the modified string.

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String modified = input.replaceAll("[aeiouAEIOU]", "*");

        System.out.println("Modified string: " + modified);

        scanner.close();
    }
}
