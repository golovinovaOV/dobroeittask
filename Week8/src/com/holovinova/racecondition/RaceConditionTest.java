package com.holovinova.racecondition;

import java.util.*;

public class RaceConditionTest {

	public static void main(String[] args) throws InterruptedException {
		List<Thread> threads = new ArrayList<Thread>(2);
		Counter counter = new Counter();
		int times = 500000;
		int threadsCount = 2;
		// create and start threads
		for (int i = 0; i < threadsCount; i++) {
			threads.add(new Thread(new RaceThread(counter, times)));
			threads.get(i).start();
		}
		// wait for all threads
		for (Thread thread : threads) {
			thread.join();
		}
		System.out.println("Counter should be equal to " + times * threadsCount);
		System.out.println("Real value of counter " + counter.getCounter());
	}
}
