package com.holovinova.racecondition;

/**
 * Custom thread type for counting
 * @author Golovinova Oksana
 *
 */
public class RaceThread implements Runnable {

	private Counter counter;

	private int times;

	public RaceThread(Counter counter, int times) {
		this.counter = counter;
		this.times = times;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.times; i++) {
			this.counter.increse();
		}
	}
}
