/*
Challenge 8: The Zero Shifter
Objective: Move all the 0s in an array to the very end, while keeping the order of the other numbers exactly the same.

Rules:
1. Here is your array: {0, 12, 0, 5, 19, 0, 8}
2. Your final output MUST look like this: {12, 5, 19, 8, 0, 0, 0}
3. You must do this IN-PLACE (O(1) space). You CANNOT create a second array.
4. Try to do it efficiently (O(n) time complexity).

Good luck.
*/

//My Attempt:
//package practice.varad.code;
//
//public class Challenge8 {
//
//	public static void main(String[] args) {
//		int array[]= {0,12,0,5,19,0,8};
//		for(int i=1;i<array.length;i++) {
//			for(int j=0;j<array.length-i;j++) {
//				if(array[j]==0) {
//					array[j]=array[j+1];
//					array[j+1]=0;
//				}
//			}
//		}
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+" ");
//		}
//	}
//
//}

//Two-Pointer Trick
package practice.varad.code;

public class Challenge8 {

	public static void main(String[] args) {
		int array[] = {0, 12, 0, 5, 19, 0, 8};
		int insertPos = 0; // Tracks where the next non-zero should go
		
		// 1. Shift all non-zeros to the front
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				// Swap current element with the insertPos
				int temp = array[insertPos];
				array[insertPos] = array[i];
				array[i] = temp;
				
				insertPos++; // Move the target spot forward
			}
		}
		
		// 2. Print the result
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
