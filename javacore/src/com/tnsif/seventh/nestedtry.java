package com.tnsif.seventh;

public class nestedtry {
public static void main(String args[]) {
	String s=null;
	try {
		try {
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println("the string is null");
		}
	}catch(Exception e) {
		System.out.println("outer catch");
	}
}
}
