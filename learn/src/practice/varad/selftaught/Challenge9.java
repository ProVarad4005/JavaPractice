/*
Challenge 9: The Mirror (Matrix Transformation)
Objective: Horizontally flip a 2D matrix so the left side becomes the right side.

Requirements:
1. The Original Data: Create this 3x3 'image' matrix in your main method:
   int[][] image = {
       {1, 2, 3}, 
       {4, 5, 6}, 
       {7, 8, 9}  
   };
2. The Blank Canvas: Create a brand new, empty 3x3 integer matrix called 'flippedImage':
   int[][] flippedImage = new int[3][3];
3. The Scan: Set up your standard nested loops to scan the original 'image' matrix (rows 'i', columns 'j').
4. The Flip (The Math): Inside the inner loop, copy the data from the original image into your new canvas, but invert the column index for the source data!
   Logic: flippedImage[i][j] = image[i][image[i].length - 1 - j];
5. The Render: After the math loops completely finish, use a SECOND set of nested loops to print out your new 'flippedImage'.
*/
package practice.varad.selftaught;

public class Challenge9 {

	public static void main(String[] args) {
		int [][]image = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int [][]flippedImage = new int[3][3];
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[i].length;j++) {
				flippedImage[i][j] = image[i][image[i].length - 1 - j];
			}
		}
		for(int i=0;i<flippedImage.length;i++) {
			for(int j=0;j<flippedImage[i].length;j++) {
				System.out.print(flippedImage[i][j]+" ");
			}
			System.out.println();
		}
	}

}
