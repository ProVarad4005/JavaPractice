/*
Challenge 3: The Crosshair (Advanced 2D Array Math)
Objective: Modify your orbital strike to draw a giant "X" across the 5x5 grid.

Requirements:
1. The Setup: Copy your Challenge2 code into a new Challenge3.java file.
2. The Logic Upgrade: You already have the Main Diagonal (top-left to bottom-right) using: 
   if (i == j)
3. The Anti-Diagonal: To get the line going from top-right to bottom-left, you need a second condition. In a 5x5 grid, the anti-diagonal coordinates are [0][4], [1][3], [2][2], [3][1], and [4][0]. 
4. The Math: Look at those coordinates. What does 'i + j' always equal? 
5. The Strike: Update your 'if' statement using the OR (||) operator so that it places a 1 if it hits the Main Diagonal OR the Anti-Diagonal.
6. The Render: Print the grid to reveal the "X"!
*/
package practice.varad.selftaught;

public class Challenge3 {

	public static void main(String[] args) {
		int grid[][] = new int[5][5];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(i==j || i+j==grid.length-1) {
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
