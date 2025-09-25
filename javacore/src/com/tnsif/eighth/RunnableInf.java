package com.tnsif.eighth;

public class RunnableInf implements Runnable {
	public void run(){
		for(int i=1;i<=10;i++)		
		{try {
			System.out.println("This is thread");
			System.out.println(Thread.currentThread());
		    Thread.sleep(2000);
		    }catch(Exception e) {
		    	System.out.println(e);
		    	}
		    }
			}
}
