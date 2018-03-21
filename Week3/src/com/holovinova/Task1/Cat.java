package com.holovinova.Task1;

public class Cat extends Animal {

	// default constructor
	public Cat() {
		this.animalType = AnimalType.CAT;
	}
	
	// constructor with parameters
	public Cat(String name, float age) {
		super(name, age);
		this.animalType = AnimalType.CAT;
	}	

	@Override
	public void voice() {
		System.out.println("Meow!");
	}	
}
