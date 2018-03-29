package com.holovinova.Task5;

import org.apache.commons.lang3.NotImplementedException;

import com.holovinova.Animal;
import com.holovinova.Cat;
import com.holovinova.Dog;
import com.holovinova.Fish;

public class TestFish {

	public static void main(String[] args) {
		int fishVoiceCounter = 0;
		Animal[] animals = new Animal[10];	
		//create instances of animals
		animals[0] = new Dog("Bim", 1);
		animals[1] = new Dog("Bobby", 8);
		animals[2] = new Fish("Fish-D", 1);
		animals[3] = new Fish("Fish-B", 3);
		animals[4] = new Cat("Tom", 5);
		animals[5] = new Dog("Ron", 2);
		animals[6] = new Cat("Tomas", 3);
		animals[7] = new Fish("Fish-C", 0.5F);
		animals[8] = new Cat("Macho", 2.5F);
		animals[9] = new Fish("Fish-A", 2);
		for (Animal animal : animals) {
			try {
				animal.voice();

			} catch (NotImplementedException exeption) {
				fishVoiceCounter++;
			}
		}
		System.out.println("NotImplementedException appears: " + fishVoiceCounter + " time(s)");
	}

}
