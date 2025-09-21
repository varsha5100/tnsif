package com.tnsif.sixth;

public class WrapperClassExample {

	    public static void main(String[] args) {
	        int primitiveInt = 100;
	        Integer wrapperInt = primitiveInt; 
	        System.out.println("Autoboxed Integer: " + wrapperInt);
	        Integer anotherWrapperInt = 250;
	        int anotherPrimitiveInt = anotherWrapperInt;
	        System.out.println("Unboxed int: " + anotherPrimitiveInt);
	        String numberAsString = "500";
	        int parsedInt = Integer.parseInt(numberAsString); 
	        System.out.println("Parsed int from String: " + parsedInt);
	        java.util.ArrayList<Integer> integerList = new java.util.ArrayList<>();
	        integerList.add(10); 
	        integerList.add(20);
	        System.out.println("ArrayList of Integers: " + integerList);
	    }
	}


