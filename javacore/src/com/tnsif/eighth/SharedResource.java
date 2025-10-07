package com.tnsif.eighth;

class SharedResource {
    private boolean dataAvailable = false;

    // Producer method
    public synchronized void produce() {
        System.out.println("Producer started...");
        dataAvailable = true;
        System.out.println("Data produced. Notifying consumer...");
        notify();  // wakes up waiting thread
    }

    // Consumer method
    public synchronized void consume() {
        System.out.println("Consumer started...");
        while (!dataAvailable) {
            try {
                System.out.println("No data available. Consumer waiting...");
                wait();  // releases lock and waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Data consumed successfully!");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Consumer thread
        Thread consumer = new Thread(() -> {
            resource.consume();
        });

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(1000); // delay so consumer starts first
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.produce();
        });

        consumer.start();
        producer.start();
    }
}

