/*
Question 2: The Data Retriever (Reading from MySQL)
Client Request:
"Now that we have bugs saved in the database, our Java console needs a way to view them. 
Write a script that fetches every ticket from the database and prints it cleanly to the console."

Technical Requirements:
1. Setup: Create Question2.java in 'com.database.engine'.
2. The Connection: Establish the exact same connection to the 'practice' database.
3. The Messenger: Create your Statement object.
4. The Query: Create a String variable holding this exact SQL command:
   String query = "SELECT * FROM tickets";
5. The Catcher: Execute the query and catch the results in a ResultSet object:
   ResultSet rs = stmt.executeQuery(query);
6. The Loop: A ResultSet acts like a cursor pointing at the database rows. Use a while loop to read through them:
   while (rs.next()) {
       // Extract the data from the current row
       int id = rs.getInt("id");
       String title = rs.getString("title");
       int priority = rs.getInt("priority");
       String status = rs.getString("status");
       
       // Print it cleanly
       System.out.println("ID: " + id + " | Title: " + title + " | Priority: " + priority + " | Status: " + status);
   }
7. Cleanup: Close rs, stmt, and con!
*/
package com.database.engine;
import java.sql.*;

public class Question2 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM tickets";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
			       int id = rs.getInt("id");
			       String title = rs.getString("title");
			       int priority = rs.getInt("priority");
			       String status = rs.getString("status");
			       System.out.println("ID: " + id + " | Title: " + title + " | Priority: " + priority + " | Status: " + status);
			   }
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("CRITICAL ERROR: Could not find the .jar file. Check your Build Path!");
		} catch (SQLException e) {
			System.out.println("CONNECTION DENIED: Check your password or ensure MySQL is running.");
			e.printStackTrace();
		}
	}

}
