package com.holovinova;

public class Cat extends Animal {

	// default constructor
	public Cat() {
		
	}
	
	// constructor with parameters
	public Cat(String name, float age) {
		super(name, age);		
	}	

	@Override
	public void voice() {
		System.out.println("Meow!");
	}	
	
	@Override
	public void dyingVoice() {
		System.out.println("Cat dying voice!");
	}
	@Override
	protected void finalize() throws Throwable {
		dyingVoice();
	}
}
