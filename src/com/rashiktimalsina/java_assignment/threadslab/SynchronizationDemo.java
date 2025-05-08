package com.rashiktimalsina.java_assignment.threadslab;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program to demonstrate synchronization where two threads try to access a shared method that prints a multiplication table. Ensure no interference occurs.

 class MultiplicationTable {
    public synchronized void printTable(int n) {
        System.out.println("Multiplication Table of " + n);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }

    }
}

class Thread1 extends Thread {

    MultiplicationTable table;

    Thread1(MultiplicationTable table) {
        this.table = table;
    }

    public void run() {
        table.printTable(5);
    }
}

class Thread2 extends Thread {
    MultiplicationTable table;

    Thread2(MultiplicationTable table) {
        this.table = table;
    }

    public void run() {
        table.printTable(7);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        MultiplicationTable syncTable = new MultiplicationTable();

        Thread1 t1 = new Thread1(syncTable);
        Thread2 t2 = new Thread2(syncTable);

        System.out.println("Starting both threads...");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("Both threads completed execution.");
    }
    }

