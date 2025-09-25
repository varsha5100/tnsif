package com.tnsif.eighth;

public class Main2 {
	public static void main(String args[]) {
RunnableInf ri=new RunnableInf();
Thread t=new Thread(ri);
t.start();
}}
