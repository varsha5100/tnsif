package com.tnsif.eighth;

public class Main3 {

	public static void main(String[] args) {
		ThreadPriority p=new ThreadPriority();
		ThreadPriority p1=new ThreadPriority();
p.setPriority(1);
p1.setPriority(10);
p.start();
p1.start();
	}

}
