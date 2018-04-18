package com.holovinova.Threads;

public class TestThread {
	public static void main(String[] args) {		
		// create object of a class which implements  Runnable
		MyThread myThread = new MyThread("Thread #1");
		// create thread
		Thread thread = new Thread(myThread);
		// start thread
		thread.start();
	}
}
