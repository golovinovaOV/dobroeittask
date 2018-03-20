package com.holovinova.Task1;

public class TestAnimal {

	public static void main(String[] args) {
		// instance of the Dog class
		Dog tim = new Dog();
		tim.age = 2;
		tim.name = "Tim";
		System.out.println(tim.toString());
		
		// instance of the Dog class
		Dog tom = new Dog("Tom", 1);
		System.out.println(tom.toString());
		
		// instance of the Cat class
		Cat kitty =  new Cat("Kitty", 1);
		System.out.println(kitty.toString());
		
		// get value of static field that counts animals
		System.out.println("There are " + Animal.getAnimalCounter() + " animals." );
	}

}
