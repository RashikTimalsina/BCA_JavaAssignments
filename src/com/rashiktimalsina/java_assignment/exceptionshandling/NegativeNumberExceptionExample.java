package com.rashiktimalsina.java_assignment.exceptionshandling;

/**
 * @author Rashik Timalsina
 * @created 14/03/2025
 */
import java.util.Scanner;

// Custom exception for negative numbers
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NegativeNumberExceptionExample{

    public static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Error: " + number + " is not valid!");
        }
        System.out.println("Number is valid: " + number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            checkNumber(number);
        } catch (NegativeNumberException e) {
            System.out.println( e.getMessage());
        } finally {
            sc.close();
        }
    }
}
