/*
Challenge 4: The Perimeter Defense (Boundary Coordinates)
Objective: Create a 6x6 grid and draw a solid border of 1s around the extreme outer edges, leaving the inside purely 0s.

Requirements:
1. The Setup: Create an empty 6x6 integer matrix.
2. The Scan: Set up your standard nested loops.
3. The Logic: You need to place a 1 ONLY if the current coordinate is on the absolute edge of the map. 
   - How do you know if you are on the very top row? (i is...)
   - How do you know if you are on the very bottom row? 
   - What about the far left column? (j is...)
   - What about the far right column?
4. The Math: Combine those 4 boundary conditions inside a single 'if' statement using the OR (||) operator. 
   (Pro-tip: Try to use 'grid.length - 1' instead of hardcoding the number 5 for the bottom/right edges!)
5. The Render: Print the grid to reveal your fortified perimeter!
*/
package practice.varad.selftaught;

public class Challenge4 {

	public static void main(String[] args) {
		int matrix[][] = new int[6][6];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if((i==0 || i==matrix.length-1) || (j==0 || j==matrix[i].length-1)) {
					matrix[i][j]=1;
				}
			}
		}

		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
