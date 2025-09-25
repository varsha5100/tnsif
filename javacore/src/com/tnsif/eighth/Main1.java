package com.tnsif.eighth;

public class Main1 {

	public static void main(String[] args) {
	threadDemo d=new threadDemo();
	d.setPriority(1);
	d.start();
	threadDemo d1=new threadDemo();
	d1.setPriority(1);
	d1.start();


	}

}
