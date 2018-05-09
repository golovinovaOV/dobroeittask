package com.holovinova.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.holovinova.DataSource;
import com.holovinova.dao.AnimalDAO;
import com.holovinova.entity.*;

public class AnimalDAOImpl implements AnimalDAO {
	/**
	 * Insert animal to db
	 * 
	 * @param animal
	 * @return
	 * @throws SQLException
	 */
	@Override
	public boolean add(Animal animal) throws SQLException {
		int affectedRows = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(INSERT_STATEMENT);
			// set all needed parameters
			preparedStatement.setString(1, animal.getName());
			preparedStatement.setLong(2, animal.getAge());
			preparedStatement.setLong(3, animal.getAnimalType());
			// get affected rows while executing statement
			affectedRows = preparedStatement.executeUpdate();           
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close statement
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			// close connection
			DataSource.closeConnection();
		}
		return affectedRows == 1;
	}

	/**
	 * Delete animal by ID from db
	 * 
	 * @param animalId
	 * @return
	 * @throws SQLException
	 */
	@Override
	public boolean remove(long animalId) throws SQLException {
		int affectedRows = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(DELETE_STATEMENT);
			// set all needed parameters
			preparedStatement.setLong(1, animalId);
			// get affected rows while executing statement
			affectedRows = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close statement
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			// close connection
			DataSource.closeConnection();
		}
		return affectedRows == 1;
	}

	/**
	 * Update animal using ID of given animal
	 * 
	 * @param animal
	 * @return
	 * @throws SQLException
	 */
	@Override
	public boolean update(Animal animal) throws SQLException {
		int affectedRows = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(UPDATE_STATEMENT);
			// set all needed parameters
			preparedStatement.setString(1, animal.getName());
			preparedStatement.setInt(2, animal.getAge());
			preparedStatement.setLong(3, animal.getAnimalType());
			preparedStatement.setLong(4, animal.getId());
			// get affected rows while executing statement
			affectedRows = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close statement
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			// close connection
			DataSource.closeConnection();
		}
		return affectedRows == 1;
	}

	/**
	 * Find animal by ID
	 * 
	 * @param animalId
	 * @return
	 * @throws SQLException
	 */
	@Override
	public Animal findById(long animalId) throws SQLException {
		Animal animal = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(SELECT_BY_ID_STATEMENT);
			// set all needed parameters
			preparedStatement.setLong(1, animalId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				animal = new Animal();
				animal.setId(resultSet.getLong(Animal.ID));
				animal.setName(resultSet.getString(Animal.NAME));
				animal.setAge(resultSet.getInt(Animal.AGE));
				animal.setAnimalType(resultSet.getLong(Animal.ID_ANIMAL_TYPE));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close statement
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			// close connection
			DataSource.closeConnection();
		}
		return animal;
	}

	/**
	 * Find all existing animals
	 * 
	 * @return
	 * @throws SQLException
	 */
	@Override
	public List<Animal> findAll() throws SQLException {
		List<Animal> animals = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(SELECT_ALL_STATEMENT);
			resultSet = preparedStatement.executeQuery();
			if (resultSet != null) {
				animals = new ArrayList<Animal>();

				while (resultSet.next()) {
					Animal animal = new Animal();
					animal.setId(resultSet.getLong(Animal.ID));
					animal.setName(resultSet.getString(Animal.NAME));
					animal.setAge(resultSet.getInt(Animal.AGE));
					animal.setAnimalType(resultSet.getLong(Animal.ID_ANIMAL_TYPE));
					animals.add(animal);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close statement
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			// close connection
			DataSource.closeConnection();
		}
		return animals;
	}

	/**
	 * Find animal by type using DI of given animal type
	 * 
	 * @param type
	 * @return
	 * @throws SQLException
	 */
	@Override
	public List<Animal> findByType(AnimalType type) throws SQLException {
		List<Animal> animals = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(SELECT_BY_ANIMAL_TYPE_STATEMENT);
			preparedStatement.setLong(1, type.getId());
			resultSet = preparedStatement.executeQuery();
			if (resultSet != null) {
				animals = new ArrayList<Animal>();

				while (resultSet.next()) {
					Animal animal = new Animal();
					animal.setId(resultSet.getLong(Animal.ID));
					animal.setName(resultSet.getString(Animal.NAME));
					animal.setAge(resultSet.getInt(Animal.AGE));
					animal.setAnimalType(resultSet.getLong(Animal.ID_ANIMAL_TYPE));
					animals.add(animal);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close statement
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			// close connection
			DataSource.closeConnection();
		}
		return animals;
	}

}
