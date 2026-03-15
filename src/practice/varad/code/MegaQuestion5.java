/*
MegaQuestion 5: The Inventory Manager (1D Arrays & Menu Loops)
Client Request:
"We need a simple console application to manage stock for 5 of our products (Items 0 through 4). 
All items start with a default stock level of 10. 

The system needs to run continuously and display a menu with four options:
1. View Current Inventory (Show the stock of all 5 items)
2. Restock (Ask which item ID, and how much to add to the stock)
3. Sell (Ask which item ID, and how much to subtract)
4. Exit System

Critical Business Rule: A user cannot sell more stock than we currently have. 
If they try, the system must block the transaction and show an error message. 
It should then return to the main menu."

Technical Requirements:
1. Setup: Create MegaQuestion5.java in 'practice.varad.code'. Import java.util.Scanner.
2. Database: Create a 1D integer array to hold the stock: int[] inventory = {10, 10, 10, 10, 10};
3. Engine: Use a 'while(true)' loop to keep the menu running.
4. Input: Use a switch statement (or if/else) to handle the user's menu choice.
*/
package practice.varad.code;

import java.util.Scanner;

public class MegaQuestion5 {
	
	void currentInventory(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	void restock(int array[],int i,int j) {
		array[i]+=j;
	}

	void sell(int array[],int i,int j) {
		if (j>array[i]) {
			System.out.println("Cant sell more stock than we currently have!");
		}
		else {
			array[i]-=j;
		}
	}

	public static void main(String[] args) {
		MegaQuestion5 obj = new MegaQuestion5();
		Scanner sc = new Scanner(System.in);
		int inventory[]= {10, 10, 10, 10, 10};
		System.out.println("Welcome!");
		boolean isTrue = true;
		int ID,quantity;
		while(isTrue) {
			System.out.println("\nMenu :\n1)View Current Stock\n2)Restock\n3)Sell\n4)Exit");
			System.out.println("Enter Your Choice :");
			int menuItem = sc.nextInt();
			switch(menuItem) {
			case(1):
				obj.currentInventory(inventory);
				break;
			case(2):
				System.out.println("Item ID: ");
				ID = sc.nextInt();
				System.out.println("Quantity: ");
				quantity = sc.nextInt();
				obj.restock(inventory,ID,quantity);
				break;
			case(3):
				System.out.println("Item ID: ");
				ID = sc.nextInt();
				System.out.println("Quantity: ");
				quantity = sc.nextInt();
				obj.sell(inventory, ID, quantity);
				break;
			case(4):
				System.out.println("Exiting...");
				isTrue=false;
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}
}
