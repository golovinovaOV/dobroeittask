package com.holovinova.Task4;

import java.util.Arrays;

import com.holovinova.Task1.Animal;
import com.holovinova.Task1.AnimalType;
import com.holovinova.Task1.Cat;
import com.holovinova.Task1.Dog;

public class AnimalShelter {
	// animal container
	private Animal[] animals;

	// getter for animal container
	public Animal[] getAnimals() {
		return animals;
	}
	// setter for animal container
	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	// method that adds animal to animal container
	public void addAnimal(AnimalType animalType, String animalName, float animalAge) {
		Animal animal = null;
		switch (animalType) {
			case CAT:
				animal = new Cat(animalName, animalAge);
				break;
			case DOG:
				animal = new Dog(animalName, animalAge); 
				break;			
			default:
				break;
		}
		// add animal to container
		// if container doesn't exist - create container and add animal
		// if container already exist - just add animal
		if (animals == null) {
			animals = new Animal[1];
			animals[0] = animal;
		}else {
			animals = Arrays.copyOf(animals, animals.length + 1);
			animals[animals.length - 1] = animal;
		}
	}

	// method that returns animal by filter
	public Animal[] getAnimalsByFilter(AnimalType animalType, float startAge, float endAge) {
		// container for filtered animals 
		Animal[] filteredAnimalContainer = null;
		// go though
		for (Animal animal : animals) {
			// if animal match condition: equal animal type and age is in range [startAge, andAge]
			// add it to new container
			if((animal.getAnimalType() == animalType) && (animal.getAge() >= startAge && animal.getAge() <= endAge)) {
				if (filteredAnimalContainer == null) {
					filteredAnimalContainer = new Animal[1];
					filteredAnimalContainer[0] = animal;
				}else {
					filteredAnimalContainer = Arrays.copyOf(filteredAnimalContainer, filteredAnimalContainer.length + 1);
					filteredAnimalContainer[filteredAnimalContainer.length - 1] = animal;
				}
			}
		}
		return filteredAnimalContainer;

	}

	
}
