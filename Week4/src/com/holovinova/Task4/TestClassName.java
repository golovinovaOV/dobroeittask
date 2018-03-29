package com.holovinova.Task4;

import com.holovinova.Animal;
import com.holovinova.Cat;
import com.holovinova.Dog;

public class TestClassName {
	public static void main(String[] args) {
		// create animal array
		Animal[] animals = new Animal[2];
		// create and add to array Dog instance
		animals[0] = new Dog("Tim", 1);
		// create and add to array Cat instances
		animals[1] = new Cat("Kitty", 4);

		for (Animal animal : animals) {
			System.out.println(animal.toString() + "\nClass name: " + Animal.getAnimalsClassName(animal));
		}
	}
}
