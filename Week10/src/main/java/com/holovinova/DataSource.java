package com.holovinova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource{
	public static final String DB_DRIVER = "org.postgresql.Driver";
	public static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
	public static final String DB_USER = "postgres";
	public static final String DB_PASSWORD = "123456";
	
	private static Connection connection;
	
	public static Connection getConnection() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Connection ERROR");
		}
		return connection;
	}
	
	public static void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
	}
}
