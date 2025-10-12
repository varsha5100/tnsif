package com.tnsif.ninth;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(101);
		al.add("shahsi");
		al.add(89.3); 
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(0));
		al.add("keerthi");
		al.add(null);
		al.add(101);
		System.out.println(al);

	}

}