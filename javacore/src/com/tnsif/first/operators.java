package com.tnsif.first;

public class operators {    
	public static void main(String[] args) {

    
	int a = 10, b = 5;
    System.out.println("---- Arithmetic Operators ----");
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));

    System.out.println("\n---- Relational Operators ----");
    System.out.println("a == b : " + (a == b));
    System.out.println("a != b : " + (a != b));
    System.out.println("a > b  : " + (a > b));
    System.out.println("a < b  : " + (a < b));
    System.out.println("a >= b : " + (a >= b));
    System.out.println("a <= b : " + (a <= b));

    System.out.println("\n---- Logical Operators ----");
    System.out.println("(a > 5 && b < 10) : " + (a > 5 && b < 10));
    System.out.println("(a > 5 || b > 10) : " + (a > 5 || b > 10));
    System.out.println("!(a > b)          : " + !(a > b));

    System.out.println("\n---- Assignment Operators ----");
    int x = 10;
    System.out.println("x = " + x);
    x += 5; System.out.println("x += 5 -> " + x);
    x -= 3; System.out.println("x -= 3 -> " + x);
    x *= 2; System.out.println("x *= 2 -> " + x);
    x /= 4; System.out.println("x /= 4 -> " + x);

    System.out.println("\n---- Unary Operators ----");
    int y = 7;
    System.out.println("y   = " + y);
    System.out.println("y++ = " + (y++));  
    System.out.println("++y = " + (++y));  
    System.out.println("y-- = " + (y--));  
    System.out.println("--y = " + (--y));  

    System.out.println("\n---- Bitwise Operators ----");
    int m = 5, n = 3;  // 5 = 0101, 3 = 0011
    System.out.println("m & n = " + (m & n)); 
    System.out.println("m | n = " + (m | n)); 
    System.out.println("m ^ n = " + (m ^ n)); 
    System.out.println("~m    = " + (~m));    
    System.out.println("m << 1 = " + (m << 1)); 
    System.out.println("m >> 1 = " + (m >> 1)); 

    System.out.println("\n---- Ternary Operator ----");
    int max = (a > b) ? a : b;
    System.out.println("Max of a and b = " + max);

}
}