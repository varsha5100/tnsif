package com.tnsif.second;

public class palindrome {

	public static void main(String[] args) {
		int num=121;
		int original=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if (rev == original) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }

	}

}
