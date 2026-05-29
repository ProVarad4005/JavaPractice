/**
 * ============================================================================
 * THE MASTER MENU: CLI Dashboard
 * ============================================================================
 * * THE SCENARIO:
 * Your backend engine is complete, but right now, a user has to run 8 
 * different files to use it. The team needs a single point of entry to 
 * interact with the tracking system.
 * * THE MISSION:
 * Create a new class `MasterMenu` with a main method. Build an interactive
 * console menu that loops indefinitely until the user chooses to exit.
 * * SPECIFICATIONS:
 * - The Loop: Use a `while` loop (like `while(true)`) so the menu re-appears 
 * after a command finishes.
 * - The Display: Print a clean, numbered list of options:
 * 1. Report a Bug (Create)
 * 2. View All Bugs (Read)
 * 3. Update Bug Status (Update)
 * 4. Exterminate Bug (Delete)
 * 5. Filter by Status
 * 6. Search by Keyword
 * 7. Count Bugs by Status
 * 8. Triage (Sort by Priority)
 * 9. Exit System
 * - The Router: Use a `Scanner` to capture the user's choice, and a `switch` 
 * statement to execute the correct class method (e.g., `Question4.exterminateBug(id)`).
 * ============================================================================
 */
package com.database.engine;
import java.util.Scanner;

public class MasterMenu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Master Menu!");
		int choice,bugId,Status;
		do {
			System.out.println("\n1.Report a bug\n2.View All bugs\n3.Update Bug Status\n4.Exterminate bug\n5.Filter by status\n6.Search by keyword\n7.Count bugs by status\n8.Triage(Sort by priority)\n9.Exit");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				Question3.insertBug();
				break;
			case 2:
				System.out.println();
				Question2.viewBugs();
				break;
			case 3:
				System.out.println("Enter bugId:");
				bugId = sc.nextInt();
				sc.nextLine();
				Question9.updateBugStatus(bugId);
				break;
			case 4:
				System.out.println("Enter the bugId you want to Terminate: ");
				bugId = sc.nextInt();
				sc.nextLine();
				Question4.exterminateBug(bugId);
				break;
			case 5:
				System.out.println("Select the status you want to filter:\n1.Open\n2.Closed");
				Status = sc.nextInt();
				sc.nextLine();
				System.out.println();
				switch (Status) {
				case 1:
					Question5.findBugByStatus("Open");
					break;
				case 2:
					Question5.findBugByStatus("Closed");
					break;
				default:
					System.out.println("Incorrect Status!");
					break;
				}
				break;
			case 6:
				System.out.println("Enter a keyword:");
				String keyword = sc.next();
				Question6.searchBugByKeyword(keyword);
				break;
			case 7:
				System.out.println("Select the status you want to count:\n1.Open\n2.Closed");
				Status = sc.nextInt();
				sc.nextLine();
				System.out.println();
				switch (Status) {
				case 1:
					Question7.countBugsByStatus("Open");
					break;
				case 2:
					Question7.countBugsByStatus("Closed");
					break;
				default:
					System.out.println("Incorrect Status!");
					break;
				}
				break;
			case 8:
				System.out.println();
				Question8.sortBugsByPriority();
				break;
			case 9:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
		} while (choice!=9);
		sc.close();
	}

}
