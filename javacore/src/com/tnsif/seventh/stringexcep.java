package com.tnsif.seventh;

public class stringexcep {
	    public static void main(String[] args) {
	        try {
	            String str = "Java";
	            System.out.println(str.charAt(10));  
	        }
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("String index is out of range: " + e.getMessage());
	        }
	    }
	}


