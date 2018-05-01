package com.holovinova.serialization;

import java.util.*;

public class TestSerialization {

	public static void main(String[] args) {
		// create list of animals
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Dog("Bim", 5));
		animalList.add(new Dog("Tom", 2));
		animalList.add(new Cat("Kitty", 3));
		animalList.add(new Cat("Tomas", 1));
		// serialize
		AnimalSerializer.serializeAnimals(animalList);
		// deserialize
		List<Animal> animals = AnimalSerializer.deserializeAnimals();
		System.out.println(animals.toString());
	}

}
