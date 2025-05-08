package com.rashiktimalsina.java_assignment.collectionslab;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program that:Uses an Iterator to access elements of a LinkedList.Prints only the even numbers from a list of integers.

public class EvenNumberPrinter {
    public static void main(String[] args) {
        List<Integer> numbers=new LinkedList<>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(12);
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);

        Iterator<Integer> iterator = numbers.iterator();

        System.out.println("list: " + numbers);
        System.out.print("Even numbers: ");

        while (iterator.hasNext()) {
            int number = iterator.next();

            if(number % 2 == 0){
                System.out.print(number+" ");
            }
        }

    }
}
