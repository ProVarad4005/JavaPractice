/*
Write a program using a do-while loop that acts like a game queue.
-The loop should print "Searching for opponent... press 1 to cancel, 0 to keep waiting".
-Accept the user's integer input using the Scanner class.
-The loop should continuously execute as long as the user enters 0,
 and terminate if they enter 1 (or anything else). Remember, a do-while loop checks the condition after execution,
 so it always runs at least once
*/

package practice.varad.code;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Searching for opponent... press 1 to cancel, 0 to keep waiting");
			c= sc.next().charAt(0);
			if (c != '0' && c !='1') {
				System.out.println("Invalid Choice. Exiting Queue.");
			}
		} while (c=='0');
	}
}
