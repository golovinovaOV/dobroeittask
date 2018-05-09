package com.holovinova.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.holovinova.DataSource;
import com.holovinova.dao.AnimalTypeDAO;
import com.holovinova.entity.AnimalType;

public class AnimalTypeDAOImpl implements AnimalTypeDAO {

	/**
	 * Insert animal type to db
	 * 
	 * @param animal
	 * @return
	 * @throws SQLException
	 */
	@Override
	public boolean add(AnimalType animalType) throws SQLException {
		int affectedRows = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(INSERT_STATEMENT);
			// set all needed parameters
			preparedStatement.setString(1, animalType.getTitle());
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
	 * Delete animal type by ID from db
	 * 
	 * @param animalId
	 * @return
	 * @throws SQLException
	 */
	@Override
	public boolean remove(long animalTypeId) throws SQLException {
		int affectedRows = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(DELETE_STATEMENT);
			// set all needed parameters
			preparedStatement.setLong(1, animalTypeId);
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
	public boolean update(AnimalType animalType) throws SQLException {
		int affectedRows = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(UPDATE_STATEMENT);
			// set all needed parameters
			preparedStatement.setString(1, animalType.getTitle());
			preparedStatement.setLong(2, animalType.getId());
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
	public AnimalType findById(long animalTypeId) throws SQLException {
		AnimalType animalType = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(SELECT_BY_ID_STATEMENT);
			// set all needed parameters
			preparedStatement.setLong(1, animalTypeId);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				animalType = new AnimalType();
				animalType.setId(resultSet.getLong(AnimalType.ID));
				animalType.setTitle(resultSet.getString(AnimalType.TITLE));
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
		return animalType;
	}

	/**
	 * Find animal by title
	 * 
	 * @param animalId
	 * @return
	 * @throws SQLException
	 */
	@Override
	public AnimalType findByTitle(String title) throws SQLException {
		AnimalType animalType = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// get connection
			connection = DataSource.getConnection();
			// create prepared statement
			preparedStatement = connection.prepareStatement(SELECT_BY_TITLE_STATEMENT);
			// set all needed parameters
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				animalType = new AnimalType();
				animalType.setId(resultSet.getLong(AnimalType.ID));
				animalType.setTitle(resultSet.getString(AnimalType.TITLE));
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
		return animalType;
	}

	/**
	 * Find all existing animal types
	 * 
	 * @return
	 * @throws SQLException
	 */
	@Override
	public List<AnimalType> findAll() throws SQLException {
		List<AnimalType> animalTypes = null;
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
				animalTypes = new ArrayList<AnimalType>();

				while (resultSet.next()) {
					AnimalType animalType = new AnimalType();
					animalType.setId(resultSet.getLong(AnimalType.ID));
					animalType.setTitle(resultSet.getString(AnimalType.TITLE));
					animalTypes.add(animalType);
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
		return animalTypes;
	}

}
