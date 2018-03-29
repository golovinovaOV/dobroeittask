package com.holovinova;

public class Dog extends Animal {

	// default constructor
	public Dog() {
		this.animalType = AnimalType.DOG;
	}

	// constructor with parameters
	public Dog(String name, float age) {
		super(name, age);
		this.animalType = AnimalType.DOG;
	}

	@Override
	public void voice() {
		System.out.println("Woof!");
	}
	
	@Override
	public void dyingVoice() {
		System.out.println("Dog dying voice!");
	}
	@Override
	protected void finalize() throws Throwable {
		dyingVoice();
	}
}
