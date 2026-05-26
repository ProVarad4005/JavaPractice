/*
Challenge 8: The Global High Score (Matrix Sweeping & Min/Max Logic)
Objective: Scan the entire data table to find and print the single highest score recorded by any player in any round.

Requirements:
1. The Data: Create this 3x4 'scores' matrix in your main method:
   int[][] scores = {
       {10, 20, 30, 40}, 
       {15, 25, 35, 45}, 
       {5,  10, 15, 20}  
   };
2. The Tracker: BEFORE your loops begin, declare an integer named 'highestScore'. 
   (Crucial Pro-Tip: Do not set it to 0. Set it to the very first item in the array: scores[0][0]. This ensures your baseline is an actual piece of data from the table!)
3. The Sweep: Set up your standard nested loops to scan every single coordinate (rows outside, columns inside).
4. The Logic: Inside the inner loop, write an 'if' statement to check if the current coordinate (scores[i][j]) is GREATER THAN your 'highestScore' tracker.
5. The Update: If the current coordinate is greater, overwrite the 'highestScore' variable with that new, higher value.
6. The Output: AFTER both loops completely finish and the sweep is done, print: 
   "The global high score is: " + highestScore
*/
package practice.varad.selftaught;

public class Challenge8 {

	public static void main(String[] args) {
		int scores[][]= {
				{10, 20, 30, 40},
				{15, 25, 35, 45},
				{5, 10, 15, 20}
		};
		int highestScore=scores[0][0];
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				if(scores[i][j]>highestScore) {
					highestScore = scores[i][j];
				}
			}
		}
		System.out.println("The global high score is: "+highestScore);
	}

}
