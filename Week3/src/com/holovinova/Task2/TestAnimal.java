package com.holovinova.Task2;

import com.holovinova.Task1.Animal;
import com.holovinova.Task1.Cat;
import com.holovinova.Task1.Dog;

public class TestAnimal {

	public static void main(String[] args) {
		// create animal array
		Animal [] animals = new Animal [7];
		// create and add to array Dog instances
		animals[0] = new Dog("Tom", 0.5F);
		animals[1] = new Dog("Tim", 1);
		animals[2] = new Dog("Bim", 3);
		animals[3] = new Dog("Ron", 8);
		// create and add to array Cat instances
		animals[4] = new Cat("Jerry", 1);
		animals[5] = new Cat("Kitty", 4);
		animals[6] = new Cat("Rob", 2);
		
		// print information about all animals from array
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].toString());
		}
	}
}
