package com.tnsif.eighth;

 class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread consumer = new Thread(() -> {
            resource.consume();
        });

     
        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.produce();
        });

        consumer.start();
        producer.start();
    }
}
