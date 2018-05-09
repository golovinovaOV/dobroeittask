package com.holovinova.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import com.holovinova.dao.*;
import com.holovinova.dao.impl.*;
import com.holovinova.entity.*;

public class TestAnimalDAO {
	private static AnimalDAO animalDAO = new AnimalDAOImpl();
	private static AnimalTypeDAO animalTypeDAO = new AnimalTypeDAOImpl();

	@Test
	public void testInsert() throws SQLException {
		AnimalType animalType = animalTypeDAO.findByTitle("Dog");
		Animal animal = new Animal("Dog", 5, animalType.getId());
		assertTrue(animalDAO.add(animal));
	}

	@Test
	public void testUpdate() throws SQLException {
		Animal animal = animalDAO.findById(3);
		animal.setName("Dog1");
		assertTrue(animalDAO.update(animal));
		
	}

	@Test
	public void testRemove() throws SQLException {
		Animal animal = animalDAO.findById(2);
		animalDAO.remove(animal.getId());
		assertNull(animalDAO.findById(2));
	}

}
