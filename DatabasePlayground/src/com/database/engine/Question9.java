/**
 * ============================================================================
 * QUESTION 9: The One-Click Close
 * ============================================================================
 * * THE SCENARIO:
 * Developers are tired of typing out "CLOSED" every time they finish a job.
 * They want a fast, single-action command to shut down a ticket permanently.
 * * THE MISSION:
 * Write a method `closeBug(int bugId)` that takes a target ID and automatically 
 * updates its status to 'CLOSED' in the database.
 * * SPECIFICATIONS:
 * - Database: 'practice'
 * - Table: 'tickets'
 * - The SQL Trick: Use the `UPDATE` statement. You can hardcode 'CLOSED' 
 * directly into the SQL string (e.g., SET status = 'CLOSED').
 * - Security Constraint: Use a PreparedStatement with ONE '?' placeholder 
 * strictly for the target ID.
 * - Output: Use `executeUpdate()` to verify the change and print a 
 * success/failure message.
 * ============================================================================
 */
package com.database.engine;
import java.sql.*;
import java.util.Scanner;

public class Question9 {
	public static void updateBugStatus(int bugId) {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		String query="UPDATE tickets SET status = 'Closed' WHERE id = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, bugId);
			int rowsUpdated = pstmt.executeUpdate();
			if (rowsUpdated>0) {
				System.out.println("Success! Ticket #" + bugId + " has been CLOSED.");
			}
			else {
				System.out.println("Miss! No ticket found with ID " + bugId + ".");
			}
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bugId:");
		int bugId = sc.nextInt();
		updateBugStatus(bugId);
		sc.close();
	}
}
