package com.rashiktimalsina.java_assignment.threadslab;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */

//Write a Java program to create a thread by extending the Thread class. The thread should print numbers from 1 to 5.

class NumberThread  extends Thread {
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
        System.out.println("Thread exiting.");
    }
}

public class MainThread {
    public static void main(String[] args) {
        NumberThread thread = new NumberThread();
        thread.start();

        System.out.println("Main thread started");
    }
}
