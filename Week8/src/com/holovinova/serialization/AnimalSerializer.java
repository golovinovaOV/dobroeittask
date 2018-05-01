package com.holovinova.serialization;

import java.io.*;
import java.util.*;

public class AnimalSerializer {
	public static void serializeAnimals(List<Animal> animals) {
		try {
			// create file output stream
			FileOutputStream fileOutputStream = new FileOutputStream(new File("animals.srl"));
			// create object output stream 
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			// write animal object
			objectOutputStream.writeObject(animals);
			// flush to make sure that information had been written
			// close object output stream
			objectOutputStream.close();
			// close file output stream
			fileOutputStream.close();
			System.out.println("Animal list had been serialized.");
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.err.println("IOException is caught.");
		}
	}

	public static List<Animal> deserializeAnimals() {
		List<Animal> animals = new ArrayList<Animal>();
		try {
			// create file input stream
			FileInputStream fileInputStream = new FileInputStream(new File("animals.srl"));
			// create object input stream 
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			// read animal object
			animals = (List<Animal>) objectInputStream.readObject();
			// close object input stream
			objectInputStream.close();
			// close file input stream
			fileInputStream.close();
			System.out.println("Animal list had been deserialized.");
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.err.println("IOException is caught.");

		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
			System.err.println("ClassNotFoundException is caught.");
		}
		return animals;
	}
}
