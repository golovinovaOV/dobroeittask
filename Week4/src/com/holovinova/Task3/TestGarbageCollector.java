package com.holovinova.Task3;

import com.holovinova.Dog;
import com.holovinova.Cat;

public class TestGarbageCollector {
	public static void main(String[] args) {
		//create a lot of instances to provoke GC
		for (int i = 0; i < 30000; i++) {
			new Dog("Tom", 3);
			System.out.println("Dog created!");
			new Cat("Kitty", 2.5F);
			System.out.println("Cat created!");
		}
	}
}
