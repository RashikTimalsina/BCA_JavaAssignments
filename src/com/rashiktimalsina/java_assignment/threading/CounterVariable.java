package com.rashiktimalsina.java_assignment.threading;

/**
 * @author Rashik Timalsina
 * @created 31/03/2025
 */

public class CounterVariable {
    private int count = 0;

    public void increment() {
        count++;
    }

    public synchronized void incrementSynchronized() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
