package com.rashiktimalsina.java_assignment.stringslab;

import java.util.Scanner;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//write a Java program that accepts a string and a character from the user, and displays the number of times that character appears in the string.

public class CharCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char result = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == result) {
                count++;
            }
        }

        System.out.println("Character " + result +" appeared "+ count +" times in the string");
        scanner.close();
    }
}
