package com.rashiktimalsina.java_assignment.threadslab;

/**
 * @author RashikTimalsina
 * @created 08/05/2025
 */


class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name+" started");
        for(int i=0; i<=3; i++) {
            System.out.println(name+" "+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                System.out.println("Error in" +name);
            }
        }

        System.out.println(name+" completed");
    }

}

public class SimpleThreadPriority {
    public static void main(String[] args) {
        Task task1 = new Task("Fast Thread with High Priority");
        Task task2 = new Task("Slow Thread with Low Priority");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Starting Thread-----");

        System.out.println(t1.getName()+" priority:"+t1.getPriority());
        System.out.println(t2.getName()+" priority:"+t2.getPriority());

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e) {
            System.out.println(" Main tread interrupted");
        }
        System.out.println(" Main tread ending");
    }

}
