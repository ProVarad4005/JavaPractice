/*
Challenge 1: The Radar Sweep (2D Array Searching)
Objective: Scan a 2D radar grid to find the exact coordinates of an enemy target.

Requirements:
1. Setup: Create a class named Challenge1 inside your 'practice.varad.selftaught' package.
2. The Grid: Create this 4x4 radar map in your main method (0 is empty space, 9 is the target):
   int[][] radar = {
       {0, 0, 0, 0},
       {0, 0, 0, 0},
       {0, 9, 0, 0},
       {0, 0, 0, 0}
   };
3. The Sweep: Use your nested 'for' loops to scan every single coordinate in the grid.
4. The Logic: Inside the inner loop, check IF the current coordinate (radar[i][j]) equals 9.
5. The Output: If you find the target, print: "Target locked! Row: [i], Column: [j]" (replace [i] and [j] with the actual variables).
6. Efficiency Bonus: Once you find the target, use the 'break;' keyword to stop the inner loop from searching the rest of that row!
*/
package practice.varad.selftaught;

public class Challenge1 {

	public static void main(String[] args) {
		int[][] radar = {
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 9, 0, 0},
				{0, 0, 0, 0}
	    };
		for(int i=0;i<radar.length;i++) {
			for(int j=0;j<radar[i].length;j++) {
				if(radar[i][j]==9) {
					System.out.println("Target locked! Coordinates: "+i+" "+j);
					break;
				}
			}
		}
	}

}
