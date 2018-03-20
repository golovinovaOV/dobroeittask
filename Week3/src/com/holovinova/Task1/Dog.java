package com.holovinova.Task1;

public class Dog extends Animal {

	// default constructor
	public Dog() {
		super();
		this.animalType = AnimalType.DOG;
	}

	// constructor with parameters
	public Dog(String name, float age) {
		super();
		this.name = name;
		this.age = age;
		this.animalType = AnimalType.DOG;
	}

	@Override
	public void voice() {
		System.out.println("Woof!");

	}

	@Override
	public String toString() {
		return this.animalType + ". Name: " + this.name + ". Age: " + this.age;
	}

}
