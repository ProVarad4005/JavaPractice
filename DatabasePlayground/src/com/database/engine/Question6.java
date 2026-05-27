/**
 * ============================================================================
 * QUESTION 6: The Detective (Wildcard Search)
 * ============================================================================
 * * THE SCENARIO:
 * A developer vaguely remembers a bug about a "login" crash but forgot the 
 * ID and status. We need a search bar feature!
 * * THE MISSION:
 * Write a method `searchBugsByKeyword(String keyword)` that finds any ticket 
 * where the title contains the target keyword.
 * * SPECIFICATIONS:
 * - Database: 'practice'
 * - Table: 'tickets'
 * - The SQL Trap: You must use the SQL 'LIKE' operator. Figure out how to 
 * safely combine the '%' wildcard with your Java variable and the '?' 
 * placeholder.
 * - Output: Loop through the ResultSet and print all matching tickets.
 * ============================================================================
 */
package com.database.engine;
import java.sql.*;
import java.util.Scanner;

public class Question6 {
	public static void searchBugByKeyword(String keyword) {
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		String query="SELECT * FROM tickets WHERE title LIKE ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1,"%"+keyword+"%");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				int priority = rs.getInt("priority");
				String status = rs.getString("status");
				System.out.println("ID: "+id+" | "+"Title: "+title+" | "+"Priority: "+priority+" | "+"Status: "+status);
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a keyword:");
		String keyword = sc.next();
		searchBugByKeyword(keyword);
		sc.close();
	}
}