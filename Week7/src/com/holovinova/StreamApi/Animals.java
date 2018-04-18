package com.holovinova.StreamApi;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Animals {

	/**
	 * Method returns first 5 animals: whose names begin with 'a', 'b', 'c' whose
	 * age greater or equal to 5
	 * 
	 * @param animals
	 * @return
	 */
	public static List<Animal> filterAnimals(List<Animal> animals) {
		if (animals == null) {
			return null;
		}
		// get stream foe collection of Animal
		Stream<Animal> filteredList = animals.stream();
		// get all animals whose age greater or equal to 5
		filteredList = filteredList.filter(animal -> animal.age >= 5);
		// get animals whose names begin with 'a', 'b', 'c'
		filteredList = filteredList.filter(animal -> (animal.name.toLowerCase().charAt(0) == 'a')
				|| (animal.name.toLowerCase().charAt(0) == 'b') || (animal.name.toLowerCase().charAt(0) == 'c'));
		// sort by age
		filteredList = filteredList.sorted((animal1, animal2) -> (int) (animal1.age - animal2.age));
		// get first 5 filtered animals
		filteredList = filteredList.limit(5);
		return filteredList.collect(Collectors.toList());
	}

	/**
	 * Methods returns list of animals. If the age is even - create a Cat animal
	 * else create Dog animal
	 * 
	 * @param animalAge
	 *            list of ages
	 * @return
	 */
	public static List<Animal> createAnimals(List<Integer> animalAge) {
		if (animalAge == null) {
			return null;
		}
		Stream<Integer> animalAgeStream = animalAge.stream();
		List<Animal> animalList = new LinkedList<Animal>();
		// for each age create animals with conditions
		animalAgeStream.forEach((number) -> {
			if (number > 0) {
				// in case age is even
				if (number % 2 == 0) {
					animalList.add(new Cat("Kitty", number));
				} else {
					animalList.add(new Dog("Bim", number));
				}
			}
		});
		return animalList;
	}
}
