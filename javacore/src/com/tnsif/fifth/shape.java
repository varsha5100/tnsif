package com.tnsif.fifth;

public abstract class shape {
	protected float area;
	abstract void calarea();
	public void show() {
		System.out.println("The area of shape is:"+area);
	} 
}
