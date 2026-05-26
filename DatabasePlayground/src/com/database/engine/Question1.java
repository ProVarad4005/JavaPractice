/*
Question 1: The Permanent Issue Tracker (Table Creation & Data Insertion)
Client Request:
"Our previous Bug Tracker resets every time we restart the console. 
We need to permanently store our bug tickets in our live MySQL database."

Technical Requirements:
1. Setup: Create Question1.java in your 'com.database.engine' package.
2. The Connection: Reuse your URL, username, and password logic to establish the connection. (Wrap it in a try/catch block!)
3. The Messenger: Once the connection is open, create a Statement object: 
   Statement stmt = con.createStatement();
   
4. The Table SQL: Create a String variable holding this exact SQL command:
   String createTable = "CREATE TABLE IF NOT EXISTS tickets (id INT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(100), priority INT, status VARCHAR(20))";
5. Execute Creation: Send the command to MySQL: 
   stmt.executeUpdate(createTable);
   
6. The Insert SQL: Create a second String variable to insert a test bug:
   String insertBug = "INSERT INTO tickets (title, priority, status) VALUES ('Login Crash', 5, 'Open')";
7. Execute Insertion: Send the insert command using executeUpdate() again, and print a "Bug Successfully Logged!" message to the console.
   
8. Cleanup: Close your Statement and your Connection!
   stmt.close();
   con.close();
*/
package com.database.engine;
import java.sql.*;

public class Question1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			String createTable = "CREATE TABLE IF NOT EXISTS tickets (id INT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(100), priority INT, status VARCHAR(20))";
			stmt.executeUpdate(createTable);
			String insertBug = "INSERT INTO tickets (title, priority, status) VALUES ('Incorrect url', 3, 'Open')";
			stmt.executeUpdate(insertBug);
			System.out.println("Bug Successfully Logged!");
			con.close();
			stmt.close();
		} catch (ClassNotFoundException e) {
			System.out.println("CRITICAL ERROR: Could not find the .jar file. Check your Build Path!");
		} catch (SQLException e) {
			System.out.println("CONNECTION DENIED: Check your password or ensure MySQL is running.");
			e.printStackTrace();
		}
	}

}
