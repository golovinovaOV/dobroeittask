package com.holovinova.racecondition;

import java.util.*;

public class RaceConditionTest {

	private static final int TIMES = 500000;
	private static final int THREADS_COUNT = 3;

	public static void main(String[] args) throws InterruptedException {
		List<Thread> threads = new ArrayList<Thread>(2);
		Counter counter = new Counter();
		// create and start threads
		for (int i = 0; i < THREADS_COUNT; i++) {
			threads.add(new Thread(new RaceThread(counter, TIMES)));
			threads.get(i).start();
		}
		// wait for all threads
		for (Thread thread : threads) {
			thread.join();
		}
		System.out.println("Counter should be equal to " + TIMES * THREADS_COUNT);
		System.out.println("Real value of counter " + counter.getCounter());
	}
}
