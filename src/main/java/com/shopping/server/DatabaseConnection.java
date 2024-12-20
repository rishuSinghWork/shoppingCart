package com.shopping.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/shopping_cart";
	private static final String USER = "####";
	private static final String PASSWORD = "#########";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
