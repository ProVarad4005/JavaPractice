/*
Question 4: The Bug Exterminator (Dynamic DELETE)
Client Request:
"A critical issue has just been fully patched in production. We need a way to scrub its record from our tracking system permanently. 
Write a script that takes a specific ticket ID and securely deletes it from the database."

Technical Requirements:
1. Setup: Create Question4.java in 'com.database.engine' and define a method: public static void exterminateBug(int bugId).
2. The Connection: Establish the exact same connection to the 'practice' database.
3. The Query: Create a String variable holding this exact SQL command using a '?' placeholder:
   String sql = "DELETE FROM tickets WHERE id = ?";
4. The Security Shield: Create a PreparedStatement to prevent SQL injection vulnerabilities:
   PreparedStatement pstmt = conn.prepareStatement(sql);
5. The Binder: Safely lock the bugId input into the '?' placeholder:
   pstmt.setInt(1, bugId);
6. The Action: Execute the update and store the number of rows that were deleted:
   int rowsAffected = pstmt.executeUpdate();
7. The Feedback: Check if the deletion was successful:
   if (rowsAffected > 0) {
       System.out.println("Target eliminated: Ticket ID " + bugId + " deleted.");
   } else {
       System.out.println("Miss! No ticket found with ID " + bugId + ".");
   }
8. Cleanup: Close pstmt and conn!
*/
package com.database.engine;
import java.sql.*;
import java.util.Scanner;

public class Question4 {
	public static void exterminateBug(int bugId) {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		String sql = "DELETE FROM tickets WHERE id = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bugId);
			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Target eliminated: Ticket ID "+bugId+" deleted.");
			} else {
				System.out.println("Miss! No ticket found with ID "+bugId+".");
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
		System.out.println("Enter the bugId you want to Terminate: ");
		int bugId = sc.nextInt();
		exterminateBug(bugId);
		sc.close();
	}
}
