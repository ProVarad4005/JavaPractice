/**
 * ============================================================================
 * QUESTION 7: The Dashboard (Data Aggregation)
 * ============================================================================
 * * THE SCENARIO:
 * The CEO doesn't have time to read individual bug reports. They just want 
 * to see one big number: "How many bugs are currently in this status?"
 * * THE MISSION:
 * Write a method `countBugsByStatus(String status)` that queries the database 
 * and prints the TOTAL NUMBER of tickets that match that status.
 * * SPECIFICATIONS:
 * - Database: 'practice'
 * - Table: 'tickets'
 * - The SQL Trick: Use the SQL `COUNT(*)` function instead of `SELECT *`.
 * - Security Constraint: Keep using the PreparedStatement '?' for the status.
 * - The Java Trick: Since COUNT() only returns a single number (one row, 
 * one column), you don't need a `while` loop. You just need to extract that 
 * specific integer from the ResultSet.
 * ============================================================================
 */
package com.database.engine;
import java.sql.*;

public class Question7 {
	public static void countBugsByStatus(String Status) {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		String query="SELECT COUNT(*) FROM tickets WHERE status=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, Status);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int number = rs.getInt(1);
				System.out.println(number);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		countBugsByStatus("Closed");
	}

}
