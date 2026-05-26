/*
MegaQuestion 6: The Issue Tracker (Parallel Arrays & String Logic)
Client Request:
"We need a console application to manage our software's bug tickets. 
Our system can hold up to 5 active bugs at a time. 
For each bug, we need to track its Title (Text), its Priority Level (1-5), and its Status (Open or Resolved).

The system needs a continuous menu:
1. View All Tickets (Print the index, title, priority, and whether it is Open or Resolved)
2. Log a New Bug (Find the first empty slot, ask the user for a Title and Priority, and set it to Open)
3. Resolve a Bug (Ask the user to type the EXACT title of the bug. Search the array, and if found, change its status to Resolved)
4. Exit System"

Technical Requirements:
1. Setup: Create MegaQuestion6.java in 'practice.varad.code'. Import java.util.Scanner.
2. The Database (Parallel Arrays): 
   - String[] bugTitles = new String[5];
   - int[] bugPriorities = new int[5];
   - boolean[] isResolved = new boolean[5]; 
     (Note: By default, String arrays are filled with 'null', and boolean arrays are filled with 'false').
3. The Engine: Use your boolean flag and 'while' loop for the menu.
4. String Methods: In Case 3, when checking if the user's input matches a bug title in the array, you CANNOT use '=='. You must use the String method: '.equalsIgnoreCase()'.
   Example: if (bugTitles[i] != null && bugTitles[i].equalsIgnoreCase(searchTitle))
5. Methods: Break the logic out into separate methods like you did in MQ5!
*/
package practice.varad.code;

import java.util.Scanner;

public class MegaQuestion6 {
	String bugTitles[]= new String[5];
	int bugPriorities[]= new int[5];
	boolean isResolved[]= new boolean[5];

	void viewAllTickets() {
		for(int i=0;i<5;i++) {
			System.out.println("Index:"+i+" Title:"+bugTitles[i]+" Priority:"+bugPriorities[i]+" Resolved:"+isResolved[i]);
		}
	}
	
	void logNewBug(String title,int priority) {
		if (priority>=0 && priority<=5) {
			for(int i=0;i<5;i++) {
				if(bugTitles[i]==null) {
					bugTitles[i]=title;
					bugPriorities[i]=priority;
					isResolved[i]=false;
					break;
				}
			}
		}
		else {
			System.out.println("Invalid Priority!");
		}
	}
	
	boolean isFull() {
		boolean full=true;;
		for(int i=0;i<5;i++) {
			if(bugTitles[i]==null) {
				full = false;
			}
		}
		if (full) {
			System.out.println("System Full!");
		}
		return full;
	}
	
	void resolveBug(String title) {
		boolean found=false;
		for(int i=0;i<5;i++) {
			if (bugTitles[i]!=null && bugTitles[i].equalsIgnoreCase(title)) {
				isResolved[i]=true;
				found=true;
				break;
			}
		}
		if (!found) {
			System.out.println("Bug Not Found!");
		}
	}
	
	public static void main(String[] args) {
		MegaQuestion6 obj = new MegaQuestion6();
		boolean stay = true;
		String title;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!");
		while(stay) {
			System.out.println("\nChoices:\n1)View All Tickets\n2)Log a New Bug\n3)Resolve a Bug\n4)Exit System\n\nEnter Choice:");
			int choice = sc.nextInt();
			switch(choice){
			case(1):
				obj.viewAllTickets();
				break;
			case(2):
				if(obj.isFull()) {
					break;
				}
				System.out.println("Enter Bug Title:");
				sc.nextLine();
				title = sc.nextLine();
				System.out.println("Enter Priority(1 to 5):");
				int priority = sc.nextInt();
				obj.logNewBug(title,priority);
				break;
			case(3):
				System.out.println("Enter Bug Title:");
				sc.nextLine();
				title = sc.nextLine();
				obj.resolveBug(title);
				break;
			case(4):
				System.out.println("Exiting...");
				stay = false;
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}

}
