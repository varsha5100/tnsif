package com.tnsif.eighth;

public class ThreadPriority extends Thread {
public void run()
{
System.out.println("the running thread name is:"Thread.currentThread().getName());
System.out.println("the running thread priority is:" Thread.getPriority());
}}
