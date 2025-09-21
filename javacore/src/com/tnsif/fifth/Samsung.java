package com.tnsif.fifth;

public class Samsung implements Phone{
	public void call() {
        System.out.println("Calling using Samsung SIM");
    }

    public void sms() {
        System.out.println("Sending SMS using Samsung SIM");
    }
}