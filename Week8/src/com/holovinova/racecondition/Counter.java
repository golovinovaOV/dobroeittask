package com.holovinova.racecondition;

/**
 * Counter class
 * 
 * @author Golovinova Oksana
 *
 */
public class Counter {
	private int counter;

	public Counter() {
		this.counter = 0;
	}
	public void increse() {
		this.counter++;
	}
	public int getCounter() {
		return this.counter;
	}
}
