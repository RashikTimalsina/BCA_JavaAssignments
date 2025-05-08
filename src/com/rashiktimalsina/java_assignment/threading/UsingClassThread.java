package com.rashiktimalsina.java_assignment.threading;

/**
 * @author Rashik Timalsina
 * @created 23/03/2025
 */
public class UsingClassThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Role Creation for user " + i);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
