package com.tnsif.eighth;

import com.tnsif.eighth.join.MyThread;
public class JoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        try {
            // Main thread will wait until t1 finishes
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            // Main thread will wait until t2 finishes
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t3.start();
        try {
            // Main thread will wait until t3 finishes
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads finished. Main thread ends.");
    }
}
