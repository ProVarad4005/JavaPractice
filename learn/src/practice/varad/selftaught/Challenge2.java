/*
Challenge 2: The Orbital Strike (Writing to 2D Arrays)
Objective: Create a blank 5x5 grid and use coordinate math to draw a perfect diagonal line of 1s across it.

Requirements:
1. Setup: Create Challenge2.java in your 'practice.varad.selftaught' package.
2. The Blank Canvas: Instead of hardcoding the numbers, create an empty 5x5 matrix using the 'new' keyword:
   int[][] grid = new int[5][5]; 
   (Note: Java automatically fills this entirely with 0s for you!)
3. The Laser Math: Create your standard nested 'for' loops to scan the grid.
4. The Logic: Inside the inner loop, check if the row index is EXACTLY the same as the column index (e.g., [0][0], [1][1]).
5. The Strike: If they match, change that specific coordinate in the grid to a 1.
6. The Render: After the math loops finish, create a SECOND set of nested loops just to print the grid out (like you did in the Minimap Scanner) to prove the diagonal line was drawn!
*/
package practice.varad.selftaught;

public class Challenge2 {

	public static void main(String[] args) {
		int grid[][] = new int[5][5];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(i==j) {
					grid[i][j]=1;
				}
			}
		}

		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}

}
