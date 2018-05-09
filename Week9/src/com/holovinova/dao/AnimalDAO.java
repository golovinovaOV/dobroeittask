package com.holovinova.dao;

import java.sql.SQLException;
import java.util.*;
import com.holovinova.entity.*;

public interface AnimalDAO {

	public static final String INSERT_STATEMENT = "INSERT INTO " + Animal.TABLE_NAME + "(" + Animal.NAME + ", "
			+ Animal.AGE + ", " + Animal.ID_ANIMAL_TYPE + ") VALUES (?, ?, ?)";
	public static final String UPDATE_STATEMENT = "UPDATE " + Animal.TABLE_NAME + " SET " + Animal.NAME + " = ?, "
			+ Animal.AGE + " = ?, " + Animal.ID_ANIMAL_TYPE + " = ? WHERE " + Animal.ID + " = ?";
	public static final String DELETE_STATEMENT = "DELETE FROM " + Animal.TABLE_NAME + " WHERE " + Animal.ID + " = ?";
	public static final String SELECT_ALL_STATEMENT = "SELECT * FROM " + Animal.TABLE_NAME;
	public static final String SELECT_BY_ID_STATEMENT = "SELECT * FROM " + Animal.TABLE_NAME + " WHERE " + Animal.ID
			+ " = ?";
	public static final String SELECT_BY_ANIMAL_TYPE_STATEMENT = "SELECT * FROM " + Animal.TABLE_NAME + " WHERE "
			+ Animal.ID_ANIMAL_TYPE + " = ?";

	/**
	 * Insert animal to db
	 * 
	 * @param animal
	 * @return
	 * @throws SQLException
	 */
	public boolean add(Animal animal) throws SQLException;

	/**
	 * Delete animal by ID from db
	 * 
	 * @param animalId
	 * @return
	 * @throws SQLException
	 */
	boolean remove(long animalId) throws SQLException;

	/**
	 * Update animal using ID of given animal
	 * 
	 * @param animal
	 * @return
	 * @throws SQLException
	 */
	boolean update(Animal animal) throws SQLException;

	/**
	 * Find animal by ID
	 * 
	 * @param animalId
	 * @return
	 * @throws SQLException
	 */
	Animal findById(long animalId) throws SQLException;

	/**
	 * Find all existing animals
	 * 
	 * @return
	 * @throws SQLException
	 */
	List<Animal> findAll() throws SQLException;

	/**
	 * Find animal by type using DI of given animal type
	 * 
	 * @param type
	 * @return
	 * @throws SQLException
	 */
	List<Animal> findByType(AnimalType type) throws SQLException;
}
