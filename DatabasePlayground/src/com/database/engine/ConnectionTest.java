package com.database.engine;

import java.sql.*; // The core Java SQL library

public class ConnectionTest {

	public static void main(String[] args) {
		
		// 1. The Database Coordinates
		// 3306 is the default port. 'sys' is a default schema built into MySQL 8.0.
		String url = "jdbc:mysql://localhost:3306/sys"; 
		String username = "root";
		String password = "Varad@101"; // Put your actual MySQL password here!
		
		try {
			// 2. Load the MySQL Translator
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully!");
			
			// 3. Attempt the Connection
			System.out.println("Pinging the MySQL Server...");
			Connection con = DriverManager.getConnection(url, username, password);
			
			// If the code reaches this line, the connection worked!
			System.out.println("SUCCESS! Java is now talking to MySQL.");
			
			// 4. Hang up the phone
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("CRITICAL ERROR: Could not find the .jar file. Check your Build Path!");
		} catch (SQLException e) {
			System.out.println("CONNECTION DENIED: Check your password or ensure MySQL is running.");
			e.printStackTrace();
		}
	}
}