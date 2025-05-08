package com.rashiktimalsina.java_assignment.threading;

/**
 * @author Rashik Timalsina
 * @created 24/03/2025
 */
class UsingSynchronized {


    public static void main(String[] args) {
        UsingSynchronized userSynchronized = new UsingSynchronized();
        userSynchronized.runThread();
    }

    public void runThread() {
        System.out.println("User Registration has been started");
        long startTime = System.currentTimeMillis();

        // processing email
        Thread thread = new Thread(new UsingInterfaceThread());
        thread.start();

        // processing roles
        Thread thread2 = new UsingClassThread();
        thread2.start();

        long endTime = System.currentTimeMillis();

        System.out.println("Successfully completed API on time: " + (endTime - startTime));
    }
}
