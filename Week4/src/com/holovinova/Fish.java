package com.holovinova;

import org.apache.commons.lang3.NotImplementedException;

public class Fish extends Animal {
	// default constructor
	public Fish() {

	}

	// constructor with parameters
	public Fish(String name, float age) {
		super(name, age);
	}

	@Override
	public void voice() {
		throw new NotImplementedException("Fish don't talk!");
	}

	@Override
	public void dyingVoice() {
		throw new NotImplementedException("Fish don't talk even when dies!");
	}

}
