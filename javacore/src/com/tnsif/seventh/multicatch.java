package com.tnsif.seventh;

public class multicatch {
public static void main(String args[]) {
	int[] arr=new int[3];
	try {
		arr[3]=20;
		int result=100/0;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("array size is exceeded");
	}catch(ArithmeticException e) {
		System.out.println("number cannot be divided");
	}
	catch(Exception e) {
		System.out.println("This is an exception"+e);
	}
}
}
