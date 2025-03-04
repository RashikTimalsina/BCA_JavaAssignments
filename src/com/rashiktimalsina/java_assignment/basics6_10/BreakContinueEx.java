package com.rashiktimalsina.java_assignment.basics6_10;

public class BreakContinueEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skip: " + i);
                continue;
            }
            if (i == 8) {
                System.out.println("Stop: " + i);
                break;
            }
            System.out.println("Number: " + i);
        }
    }
}
