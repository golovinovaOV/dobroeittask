package com.holovinova.dao;

import java.sql.SQLException;
import java.util.List;

import com.holovinova.entity.*;

public interface AnimalTypeDAO {
	public static final String INSERT_STATEMENT = "INSERT INTO " + AnimalType.TABLE_NAME + "(" + AnimalType.TITLE
			+ ") VALUES (?)";
	public static final String UPDATE_STATEMENT = "UPDATE " + AnimalType.TABLE_NAME + " SET " + AnimalType.TITLE
			+ " = ? WHERE " + AnimalType.ID + " = ?";
	public static final String DELETE_STATEMENT = "DELETE FROM " + AnimalType.TABLE_NAME + " WHERE " + AnimalType.ID
			+ " = ?";
	public static final String SELECT_ALL_STATEMENT = "SELECT * FROM " + AnimalType.TABLE_NAME;
	public static final String SELECT_BY_ID_STATEMENT = "SELECT * FROM " + AnimalType.TABLE_NAME + " WHERE "
			+ AnimalType.ID + " = ?";
	public static final String SELECT_BY_TITLE_STATEMENT = "SELECT * FROM " + AnimalType.TABLE_NAME + " WHERE "
			+ AnimalType.TITLE + " = ?";

	public boolean add(AnimalType animalType) throws SQLException;

	boolean remove(long animalTypeId) throws SQLException;

	boolean update(AnimalType animalType) throws SQLException;

	AnimalType findById(long animalTypeId) throws SQLException;

	AnimalType findByTitle(String name) throws SQLException;

	List<AnimalType> findAll() throws SQLException;

}
