/*
Challenge 5: The Chessboard (Alternating Patterns)
Objective: Create an 8x8 grid and fill it with an alternating pattern of 1s and 0s, exactly like a chessboard.

Requirements:
1. The Blank Canvas: Create an empty 8x8 integer matrix.
2. The Scan: Set up your standard nested loops.
3. The Math: Look at the coordinates where the 1s should go: [0][0], [0][2], [1][1], [1][3], [2][0], [2][2] etc. 
   What do you notice about the SUM of (i + j) for all of those specific spots? Are those sums even or odd?
4. The Logic: Inside your inner loop, write an 'if' statement using the modulo operator (%) to check if the sum of (i + j) is an even number.
5. The Fill: If the sum is even, set that coordinate to 1.
6. The Render: Print the grid to reveal your perfectly checkered board!
*/
package practice.varad.selftaught;

public class Challenge5 {

	public static void main(String[] args) {
		int board[][] = new int[8][8];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if((i+j)%2==0) {
					board[i][j]=1;
				}
			}
		}

		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
