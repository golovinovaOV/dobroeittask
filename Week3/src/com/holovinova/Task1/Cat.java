package com.holovinova.Task1;

public class Cat extends Animal {

	// default constructor
	public Cat() {
		super();
		this.animalType = AnimalType.CAT;
	}
	
	// constructor with parameters
	public Cat(String name, float age) {
		super();
		this.name = name;
		this.age = age;
		this.animalType = AnimalType.CAT;
	}	

	@Override
	public void voice() {
		System.out.println("Meow!");
	}

	@Override
	public String toString() {
		return this.animalType + ". Name: " + this.name + ". Age: " + this.age;
	}
}
