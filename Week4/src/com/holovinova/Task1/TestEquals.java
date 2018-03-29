package com.holovinova.Task1;

import com.holovinova.Cat;
import com.holovinova.Dog;

public class TestEquals {
	public static void main(String[] args) {
		Cat catTimmy = new Cat("Timmy", 2.5F);
		Cat catTom = new Cat("Timmy", 2.5F);
		Cat catTomas = new Cat("Timmy", 2.5F);
		Dog dog = new Dog("Bob", 5);
		
		System.out.println("Reflexive. Object equals to himself.");
		System.out.println("Answer: " + catTimmy.equals(catTimmy));
		
		System.out.println("Symmetric. If object x equals to object x then x equals to x.");
		System.out.println("Answer: " + (catTimmy.equals(catTom) && catTom.equals(catTimmy)));
		
		System.out.println("Transitive. If object x equals to object y and object y equals to object z then x equals to z");
		System.out.println("Answer: " + (catTimmy.equals(catTom) & catTom.equals(catTomas) && catTimmy.equals(catTomas)));
		
		System.out.println("Nothing equals to null.");
		System.out.println("Answer: " + catTimmy.equals(null));
		
		System.out.println("Not equal objects.");
		System.out.println("Answer: " + catTimmy.equals(dog));		
	}

}
