package com.holovinova.Task3;

import java.util.Arrays;

import com.holovinova.Task1.Animal;
import com.holovinova.Task1.Cat;
import com.holovinova.Task1.Dog;

public class TestAnimal {

	public static void main(String[] args) {
		
		// create animal array
		Animal[] animals = new Animal[7];
		// create and add to array Dog instances
		animals[0] = new Dog("Tomas Robinson", 0.5F);
		animals[1] = new Dog("Timmmmy ", 9);
		animals[2] = new Dog("Bim", 3);
		animals[3] = new Dog("Ronnnny", 10);
		// create and add to array Cat instances
		animals[4] = new Cat("Jerry", 1);
		animals[5] = new Cat("Kitty The Cat", 4);
		animals[6] = new Cat("Rob", 8);
		System.out.println("All animals\n");
		Animals.printAnimals(animals);
		// remove animals with condition
		animals = Animals.removeAnimalByAgeAndByName(animals);
		
		System.out.println("\nAnimals (removed animal with (1 > age) and (age > 8) and animals whose name has more than 4 consonants)\n");
		Animals.printAnimals(animals);
	}

}
