package com.holovinova.threads;

public class ThreadCalculation implements Runnable{

	private int endNumber;
	
	public ThreadCalculation(int endNumber) {
		this.endNumber = endNumber;
	}
	
	@Override
	public void run() {		
		System.out.println("Thread: " + Thread.currentThread().getName() + " Sum: " + SumCalculation.getSum(endNumber));
	}

}
