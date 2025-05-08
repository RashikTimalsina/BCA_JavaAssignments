package com.rashiktimalsina.java_assignment.stringslab;

import java.util.Scanner;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program to:
//Append a string using StringBuffer
//Insert a word at a specified position

public class StringBufferExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuffer buffer = new StringBuffer();

        System.out.print("Enter a string to append: ");
        String appendStr = scanner.nextLine();
        buffer.append(appendStr);

        System.out.println("After appending: " + buffer);

        System.out.print("Enter a word to insert: ");
        String insertWord = scanner.nextLine();

        System.out.print("Enter the position to insert at: ");
        int position = scanner.nextInt();

        if (position >= 0 && position <= buffer.length()) {
            buffer.insert(position, insertWord);
            System.out.println("After insertion: " + buffer);
        } else {
            System.out.println("Invalid Position: " + buffer.length());
        }

        scanner.close();
    }
}

