package com.tnsif.eighth;

public class join {
	class MyThread extends Thread {
	    public void run() {
	        for (int i = 1; i <= 3; i++) {
	            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
	            try {
	                Thread.sleep(500); // pause for half a second
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
	}}

	