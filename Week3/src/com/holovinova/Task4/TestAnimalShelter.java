package com.holovinova.Task4;

import com.holovinova.Task1.AnimalType;
import com.holovinova.Task3.Animals;

public class TestAnimalShelter {
	public static void main(String[] args) {
		// create instance of animal shelter
		AnimalShelter animalShelter = new AnimalShelter();
		// add animals to container
		animalShelter.addAnimal(AnimalType.CAT, "Zizi", 5);
		animalShelter.addAnimal(AnimalType.DOG, "Bim", 1);
		animalShelter.addAnimal(AnimalType.CAT, "Tommy", 2);
		animalShelter.addAnimal(AnimalType.CAT, "Tompson", 3);
		animalShelter.addAnimal(AnimalType.DOG, "Tony", 9);
		animalShelter.addAnimal(AnimalType.DOG, "Rob", 8);
		animalShelter.addAnimal(AnimalType.DOG, "Bobby", 3);
		
		System.out.println("All animals\n");
		Animals.printAnimals(animalShelter.getAnimals());
		System.out.println("\nFiltered animals\n");
		Animals.printAnimals(animalShelter.getAnimalsByFilter(AnimalType.DOG, 1, 9));
		System.out.println("\nFiltered animals\n");
		Animals.printAnimals(animalShelter.getAnimalsByFilter(AnimalType.CAT, 1, 3));
	}
}
