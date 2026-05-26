/*
Challenge 6: The Spreadsheet (Data Processing)
Objective: Calculate and print the total sum of each row in a 2D data table.

Requirements:
1. The Data: Create this 3x4 matrix in your main method representing points scored by 3 players over 4 rounds:
   int[][] scores = {
       {10, 20, 30, 40}, // Player 1 (Index 0)
       {15, 25, 35, 45}, // Player 2 (Index 1)
       {5,  10, 15, 20}  // Player 3 (Index 2)
   };
2. The Scan: Set up your nested loops to navigate the grid.
3. The Accumulator: INSIDE the outer 'i' loop (but BEFORE the inner 'j' loop), declare an integer called 'rowTotal' and set it to 0. 
   (Crucial logic: It must reset to 0 at the start of every new row so the players' scores don't mix together!).
4. The Math: INSIDE the inner 'j' loop, add the current coordinate's value to 'rowTotal' (rowTotal += scores[i][j];).
5. The Output: AFTER the inner loop completely finishes (but still inside the outer loop), print: 
   "Player " + (i + 1) + " Total: " + rowTotal
*/
package practice.varad.selftaught;

public class Challenge6 {

	public static void main(String[] args) {
		int[][] scores = {
	       {10, 20, 30, 40},
	       {15, 25, 35, 45},
	       {5,  10, 15, 20}
		};

		for(int i=0;i<scores.length;i++) {
			int rowTotal=0;
			for(int j=0;j<scores[i].length;j++) {
				rowTotal+=scores[i][j];
			}
			System.out.println("Player "+(i+1)+" Total: "+rowTotal);
		}
	}

}
