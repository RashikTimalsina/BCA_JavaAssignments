package com.rashiktimalsina.java_assignment;

import java.util.Scanner;

public class IfSwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if-else
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


        // Using switch
        switch (Integer.signum(num)) {
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
            case 0:
                System.out.println("Zero");
                break;
        }

        sc.close();
    }
}
