/*
Concept Test: The Minimap Scanner (2D Arrays & Nested Loops)
Objective: Initialize a 2D grid and use nested loops to print it out like a map.

Requirements:
1. Setup: Create a class named TwoDArrays inside your 'learn.varad.code' package.
2. The Grid: In your main method, create a 2D integer array representing a 3x3 map:
   int[][] map = {
       {0, 0, 1},
       {0, 2, 0},
       {3, 0, 0}
   };
3. The Scanner: Create a 'for' loop using 'i' to loop through the rows (map.length).
4. Inside that loop, create a second 'for' loop using 'j' to loop through the columns in that specific row (map[i].length).
5. Print: Inside the inner loop, print the coordinate map[i][j] + " " (use print, NOT println, so they stay on the same line).
6. Newline: After the inner loop finishes (but still inside the outer loop), add a blank System.out.println(); so the next row drops down to a new line.
*/
package learn.varad.code;

public class TwoDArrays {

	public static void main(String[] args) {
		int map[][]= {
				{0,0,1},
				{0,2,0},
				{3,0,0}
		};
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

}
