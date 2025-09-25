package com.tnsif.seventh;

public class trycatch {
public static void main(String args[]) {
	int a=2,b=0,c;
	try {
		c=a/b;
	}catch(Exception e){
		System.out.println("Number cannot be divided by zero");		
	}
	finally {
		System.out.println("this is an Arithemetic exception");
	}
}
}
