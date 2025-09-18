package com.tnsif.fourth;

public class methodoverload {
	double x,y,z;
	public void method(){
		System.out.println("zero parameters");
	}

	public void method(int a){
		x=a;
		System.out.println("single parameter");
	}
	public void method(int a,int b){
		x=a;
		y=b;
		System.out.println("two parameters");
	}
	public void method(double a,double b,double c){
		x=a;
		y=b;
		z=c;
	}
}
