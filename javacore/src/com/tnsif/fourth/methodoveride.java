package com.tnsif.fourth;

public class methodoveride {
public void show() {
	System.out.println("this is parent class");
}
}
class child extends methodoveride{
	public void show() {
		System.out.println("this is child class");
	}
}