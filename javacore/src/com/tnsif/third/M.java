package com.tnsif.third;

public class M {
void show(){
	System.out.println("This Is class M");
}
}
class N extends M{
	void show1() {
		System.out.println("This is class N");
	}
}
class O extends N{
	void show2() {
		System.out.println("This is class O");
	}
}
class P extends N{
	void show3() {
		System.out.println("This is class P");
	}
}

