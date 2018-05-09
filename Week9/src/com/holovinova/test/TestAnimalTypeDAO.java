package com.holovinova.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import org.junit.Test;
import com.holovinova.dao.AnimalTypeDAO;
import com.holovinova.dao.impl.AnimalTypeDAOImpl;
import com.holovinova.entity.AnimalType;

public class TestAnimalTypeDAO {

	@Test
	public void testInsert() throws SQLException {
		AnimalType animalTypeFish = new AnimalType("Fish");
		AnimalTypeDAO animalTypeDAO = new AnimalTypeDAOImpl();
		animalTypeDAO.add(animalTypeFish);
		AnimalType animalType = animalTypeDAO.findByTitle("Fish");
		animalTypeFish.setId(animalType.getId());
		assertTrue(animalTypeFish.equals(animalTypeDAO.findByTitle("Fish")));
	}

	@Test
	public void testUpdate() throws SQLException {
		AnimalTypeDAO animalTypeDAO = new AnimalTypeDAOImpl();
		AnimalType animalTypeFish = animalTypeDAO.findByTitle("Fish");		
		animalTypeFish.setTitle("Big fish");
		animalTypeDAO.update(animalTypeFish);
		AnimalType animalTypeDogDB = animalTypeDAO.findByTitle("Big fish");
		assertTrue(animalTypeFish.equals(animalTypeDogDB));
	}

	@Test
	public void testRemove() throws SQLException {
		AnimalTypeDAO animalTypeDAO = new AnimalTypeDAOImpl();
		AnimalType animalType = animalTypeDAO.findByTitle("Big fish");
		animalTypeDAO.remove(animalType.getId());
		assertNull(animalTypeDAO.findById(animalType.getId()));
	}
}
