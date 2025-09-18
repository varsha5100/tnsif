package com.tnsif.third;

public class Super {
	public void show(){
		System .out.println("this is parent class");
	}

}
class Base extends Super{
	public void display() {
		System.out.println("this is a base class");
		super.show();
	}
} 