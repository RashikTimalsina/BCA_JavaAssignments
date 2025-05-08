package com.rashiktimalsina.java_assignment.threading;

/**
 * @author Rashik Timalsina
 * @created 23/03/2025
 */
public class ThreadMain {

    public static void main(String[] args) {

        System.out.println("User Registration has been started");
        long startTime = System.currentTimeMillis();


        Thread thread = new Thread(new UsingInterfaceThread());
        thread.start();


        Thread thread2 = new UsingClassThread();
        thread2.start();


        long endTime = System.currentTimeMillis();

        System.out.println("Successfully completed API on time: " + (endTime - startTime));
    }
}
