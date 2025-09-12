package com.tnsif.first;

public class datatype {
	public static void main(String args[]) {
	byte b=100;
	short s=1000;
	int i=10000;
	long l=1000000;
	float f=10.35f;
	double d=12.222234;
	char c='A';
	boolean flag = false;
	System.out.println("----Primitive datatypes----");
	System.out.println("byte:"+b+"short:"+s+"int:"+i+"long:"+l+"float:"+f+"dounle:"+d+"char:"+c+"boolean:"+flag);
	String str = "Hello, Java!";
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("\n--- Non-Primitive Data Types ---");
    System.out.println("String: " + str);
    System.out.print("Array: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }
	}
}
