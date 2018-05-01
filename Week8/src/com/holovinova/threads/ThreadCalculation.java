package com.holovinova.threads;

public class ThreadCalculation implements Runnable{

	@Override
	public void run() {		
		System.out.println("Thread: " + Thread.currentThread().getName() + " Sum: " + SumCalculation.getSum(10000000));
	}

}
