/*
Challenge 7: The Column Cruncher (Vertical Data Processing)
Objective: Calculate and print the total sum of each column to find the total points scored in each round.

Requirements:
1. The Data: Copy your exact 'scores' matrix from Challenge 6.
2. The Loop Inversion: To process vertically, your OUTER loop must scan the columns (j) and your INNER loop must scan the rows (i). 
   Set the outer 'j' loop to run until it hits scores[0].length (the number of columns).
3. The Inner Loop: Set the inner 'i' loop to run until it hits scores.length (the number of rows).
4. The Accumulator: INSIDE the outer 'j' loop, declare 'int colTotal = 0;'.
5. The Math: Inside the inner 'i' loop, add the current coordinate to the total (colTotal += scores[i][j];). 
   (Notice that 'i' is changing rapidly to go down the rows, while 'j' stays locked on the current column!).
6. The Output: AFTER the inner loop completely finishes, print: 
   "Round " + (j + 1) + " Total: " + colTotal
*/
package practice.varad.selftaught;

public class Challenge7 {

	public static void main(String[] args) {
		int[][] scores = {
	       {10, 20, 30, 40},
	       {15, 25, 35, 45},
	       {5,  10, 15, 20}
		};

		for(int j=0;j<scores[0].length;j++) {
			int colTotal=0;
			for(int i=0;i<scores.length;i++) {
				colTotal+=scores[i][j];
			}
			System.out.println("Round "+(j+1)+" Total: "+colTotal);
		}
	}

}
