package com.rashiktimalsina.assignment;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        int sum = 0;
        int num = 5;
        int[] arr = new int[num];
        System.out.println("Enter the five elements in the array: ");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }
        double average = (double) sum / num;
        System.out.println("The average of the array is: " + average);


    }
}
