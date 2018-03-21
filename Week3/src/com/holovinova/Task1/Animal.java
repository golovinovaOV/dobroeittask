package com.holovinova.Task1;

public abstract class Animal {
	// counter for all kind of animals
	private static int animalCounter = 0;
	// name of pet
	protected String name = "Unknown";
	// age of pet
	protected float age = 0;
	// animal type field
	protected AnimalType animalType = AnimalType.NONE;

	// constructor without arguments,
	// here is mechanism for counting animals
	public Animal() {
		Animal.animalCounter += 1;
	}

	// constructor with arguments
	public Animal(String name, float age) {
		this();
		this.name = name;
		this.age = age;
	}

	// getter for animalType field
	public AnimalType getAnimalType() {
		return animalType;
	}

	// setter for animalType field
	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

	// getter for name field
	public String getName() {
		return name;
	}

	// setter for name field
	public void setName(String name) {
		this.name = name;
	}

	// getter for age field
	public float getAge() {
		return age;
	}

	// setter for age field
	public void setAge(int age) {
		this.age = age;
	}

	// method that can be called for getting counter of animal
	// it's static, so it can be called without instantiation Animal class
	public static int getAnimalCounter() {
		return animalCounter;
	}

	// method which should be overridden in a particular class
	public abstract void voice();

	@Override
	public String toString() {
		return this.animalType + ". Name: " + this.name + ". Age: " + this.age;
	}
}
