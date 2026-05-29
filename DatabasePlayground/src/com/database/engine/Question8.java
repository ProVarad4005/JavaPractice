/**
 * ============================================================================
 * QUESTION 8: The Triage (Sorting)
 * ============================================================================
 * * THE SCENARIO:
 * The team is overwhelmed. They need to see the most critical bugs at the 
 * top of their feed so they know what to fix first.
 * * THE MISSION:
 * Write a method `sortBugsByPriority()` that retrieves all tickets and prints 
 * them ordered by their priority level (Highest number first).
 * * SPECIFICATIONS:
 * - Database: 'practice'
 * - Table: 'tickets'
 * - The SQL Trick: You don't need a WHERE clause this time. You need to use 
 * the SQL `ORDER BY` clause combined with `DESC` (Descending).
 * - Output: Use a while(rs.next()) loop to print the tickets cleanly.
 * ============================================================================
 */
package com.database.engine;
import java.sql.*;

public class Question8 {
	public static void sortBugsByPriority() {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		String query="SELECT * FROM tickets ORDER BY priority DESC";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				int priority = rs.getInt("priority");
				String status = rs.getString("status");
				System.out.println("ID: "+id+" | "+"Title: "+title+" | "+"Priortiy: "+priority+" | "+"Status: "+status);
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
		sortBugsByPriority();
	}

}
