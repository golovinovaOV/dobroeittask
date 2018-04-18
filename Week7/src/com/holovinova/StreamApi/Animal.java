package com.holovinova.StreamApi;

public abstract class Animal{
	// counter for all kind of animals
	private static int animalCounter = 0;
	// name of pet
	protected String name = "Unknown";
	// age of pet
	protected float age = 0;
	
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

	// method which should be overridden in a particular class
	public abstract void dyingVoice();

	@Override
	public String toString() {
		return "\n" + this.getClass().getSimpleName() + ". Name: " + this.name + ". Age: " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj == null) || !(obj.getClass() == getClass())) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Animal innerObject = (Animal) obj;
		return this.name.equals(innerObject.name) && (Float.compare(this.age, innerObject.age) == 0)
				&& (Animal.getAnimalsClassName(this).equals(Animal.getAnimalsClassName(innerObject)));
	}

	@Override
	public int hashCode() {
		int result = new Float(age).hashCode();
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	public static String getAnimalsClassName(Object obj) {
		return obj.getClass().getSimpleName();
	}	
}
