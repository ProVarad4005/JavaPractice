/*
Question 3: The Dynamic Entry System (PreparedStatement)
Client Request:
"We can't keep hardcoding our bugs into the Java code. 
We need the system to ask the user for the bug details, and then save THOSE specific details to the database."

Technical Requirements:
1. Setup: Create Question3.java in 'com.database.engine'.
2. The Scanner: Import java.util.Scanner and ask the user for three things:
   - Bug Title (String)
   - Priority Level (int)
   - Status (String)
3. The Connection: Establish your connection to the 'practice' database.
4. The Dynamic SQL: Create a String using '?' placeholders instead of real data:
   String insertSQL = "INSERT INTO tickets (title, priority, status) VALUES (?, ?, ?)";
5. The PreparedStatement: Create your specialized messenger:
   PreparedStatement pstmt = con.prepareStatement(insertSQL);
6. Inject the Variables: Map your Java variables to the '?' placeholders (1st, 2nd, 3rd):
   pstmt.setString(1, userTitle);
   pstmt.setInt(2, userPriority);
   pstmt.setString(3, userStatus);
7. Execute: Send the messenger! (Notice you don't pass the SQL string here, it's already loaded):
   pstmt.executeUpdate();
   System.out.println("Dynamic bug saved to database!");
8. Cleanup: Close pstmt, con, and your scanner.
*/
package com.database.engine;
import java.sql.*;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/practice";
		String username="root";
		String password="Varad@101";
		System.out.println("Bug Title : ");
		String BugTitle = sc.nextLine();
		System.out.println("Priority Level : ");
		int PriorityLevel = sc.nextInt();
		sc.nextLine();
		System.out.println("Status : ");
		String Status = sc.nextLine();
		String insertSQL = "INSERT INTO tickets (title, priority, status) VALUES (?, ?, ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = con.prepareStatement(insertSQL);
			pstmt.setString(1, BugTitle);
			pstmt.setInt(2, PriorityLevel);
			pstmt.setString(3, Status);
			pstmt.executeUpdate();
			System.out.println("Dynamic bug saved to database!");
			pstmt.close();
			con.close();
			sc.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
