/**
 * ============================================================================
 * QUESTION 5: The Filter (Advanced Retrieval)
 * ============================================================================
 * * THE SCENARIO:
 * The database is getting crowded. The project manager only wants to see 
 * tickets that require immediate attention.
 * * THE MISSION:
 * Write a method `findBugsByStatus(String status)` that retrieves and prints 
 * only the tickets that match the given status parameter.
 * * SPECIFICATIONS:
 * - Database: 'practice'
 * - Table: 'tickets'
 * - Security Constraint: Use a PreparedStatement to bind the dynamic status 
 * parameter to a '?' in the SQL query.
 * - Output: Loop through the ResultSet and print the matching tickets cleanly.
 * ============================================================================
 */
package com.database.engine;
import java.sql.*;

public class Question5 {
	public static void findBugByStatus(String Status) {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		String sql="SELECT * FROM tickets WHERE status=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Status);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
			       int id = rs.getInt("id");
			       String title = rs.getString("title");
			       int priority = rs.getInt("priority");
			       String status = rs.getString("status");
			       System.out.println("ID: " + id + " | Title: " + title + " | Priority: " + priority + " | Status: " + status);
			   }
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		findBugByStatus("Open");
	}

}
