package com.tnsif.fifth;

public class square extends shape
{
	private int side=3;
	public square(int side)
	{
		this.side=side;
	}
	void calarea() {
		super.area=side*side;
	}

}
