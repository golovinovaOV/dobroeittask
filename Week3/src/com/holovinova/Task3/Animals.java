package com.holovinova.Task3;

import java.util.*;

import com.holovinova.Task1.Animal;

public class Animals {
	
	private static char[] vowels = {'a', 'e', 'o', 'u', 'y', 'i'};

	// remove animals with 1 > age and age >8
	// and whose name has more than 4 consonants
	public static Animal[] removeAnimalByAgeAndByName(Animal[] animals) {
		// array for animal that don't match to condition
		Animal[] goodAgeAnimals = null;
		char[] animalName = null;		
		int vowelsCount = 0;
		// go through all animals in array
		for (Animal animal : animals) {
			// if age match to condition
			if (animal.getAge() >= 1 && animal.getAge() < 9) {
				// get name of animal (convert it to char array)
				animalName = animal.getName().toCharArray();
				// set vowels counter to 0 for each animal name
				vowelsCount = 0;
				// go through animal name
				for(int i = 0; i < animalName.length; i++) {
					for (int j = 0; j < vowels.length; j++) {
						// if letter is vowel count it
						if(animalName[i] == vowels[j]) {
							vowelsCount++;
							break;
						}
					}
				}				
				// check how many consonants in animal name
				// if less than 4 or equal 4 add animal to goodAnimal 
				if(animalName.length - vowelsCount < 4) {
					if(goodAgeAnimals == null) {
						goodAgeAnimals = new Animal[1];
						goodAgeAnimals[0] = animal;
					}else {
						goodAgeAnimals = Arrays.copyOf(goodAgeAnimals, goodAgeAnimals.length + 1);
						goodAgeAnimals[goodAgeAnimals.length - 1] = animal;
					}
				}
			}
		}
		return goodAgeAnimals;
	}
	// method prints animal array
	public static void printAnimals(Animal[] animals) {
		for (Animal animal : animals) {
			System.out.println(animal.toString());
		}
	}
}
