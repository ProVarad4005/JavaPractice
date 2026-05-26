/*
Question 3: Pattern Printer
Write a program using nested for loops to print the following exact pattern:
*
* *
* * *
* * * *
* * * * *

Requirements:
- The outer loop should control the number of rows.
- The inner loop should control the number of characters printed per row.
*/
package practice.varad.code;

public class Question3 {

	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
