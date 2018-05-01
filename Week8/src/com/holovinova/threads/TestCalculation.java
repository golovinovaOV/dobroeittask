package com.holovinova.threads;

import java.util.*;

public class TestCalculation {
	
	private static final int END_NUMBER = 1000000000;

	public static void main(String[] args) throws InterruptedException {
		getSum();
		getSumInThreads();
	}

	/**
	 * Method shows time needed for calculation
	 */
	private static void getSum() {
		long startTime;
		long endTime;
		// get time before calculations
		startTime = System.currentTimeMillis();
		// get sum 4 times
		for (int i = 0; i < 4; i++) {
			System.out.println(i + " Sum: " + SumCalculation.getSum(END_NUMBER));
		}
		// get time after calculations
		endTime = System.currentTimeMillis();
		// get result
		System.out.println("Time: " + (endTime - startTime));

	}

	/**
	 * Method shows time needed for calculation using threads mechanism
	 * 
	 * @throws InterruptedException
	 */
	private static void getSumInThreads() throws InterruptedException {
		long startTime;
		long endTime;
		// get time before calculations
		startTime = System.currentTimeMillis();		
		List<Thread> threads = new ArrayList<Thread>();
		//create and start threads
		for (int i = 0; i < 4; i++) {
			threads.add(new Thread(new ThreadCalculation(END_NUMBER)));
			threads.get(i).start();
		}
		// wait for all threads
		for (Thread thread : threads) {
			thread.join();
		}
		// get time after calculations
		endTime = System.currentTimeMillis();
		// get result
		System.out.println("Time: " + (endTime - startTime));
	}

}
