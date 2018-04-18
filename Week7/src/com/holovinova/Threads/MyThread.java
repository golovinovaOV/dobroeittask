package com.holovinova.Threads;

public class MyThread implements Runnable{

	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Thread name: " + this.name);
		
	}

}
