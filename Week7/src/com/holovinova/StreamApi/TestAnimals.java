package com.holovinova.StreamApi;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestAnimals {
	public static void main(String[] args) {
		// steare list of animals
		List<Animal> animals = new LinkedList<Animal>() {
			{
				add(new Dog("Bim", 5));
				add(new Dog("Bobby", 3));
				add(new Dog("Archi", 6));
				add(new Dog("Cid", 7));
				add(new Cat("Max", 6));
				add(new Cat("Bom", 3));
				add(new Cat("Anri", 8));
				add(new Cat("Alice", 5));
				add(new Cat("Cat", 9));
			}
		};
		// get filter animal list
		System.out.println(Animals.filterAnimals(animals));
		// create list of animal ages
		List<Integer> animalsAgeList = new ArrayList<Integer>() {
			{
				add(5);
				add(10);
				add(7);
				add(6);
			}
		};
		// get list of animals
		System.out.println(Animals.createAnimals(animalsAgeList));
	}
}
