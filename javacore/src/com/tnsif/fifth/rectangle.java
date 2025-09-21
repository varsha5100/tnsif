package com.tnsif.fifth;

public class rectangle extends shape {
	private int length=3,breadth=2;
	public rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void calarea() {
		super.area=length*breadth;
	}
}
