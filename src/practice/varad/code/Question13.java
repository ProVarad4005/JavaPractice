/*
Question 11: The Bubble Sort Lab
Objective: Sort an array of integers in ascending order using nested loops.

1. Create an unsorted integer array: {64, 34, 25, 12, 22, 11, 90}.
2. Use a nested 'for' loop:
   - Outer loop (i): Controls the number of passes.
   - Inner loop (j): Compares arr[j] and arr[j+1].
3. The Swap: If arr[j] > arr[j+1], use a 'temp' variable to swap them.
4. Print the array after the sorting is complete.
*/
package practice.varad.code;

import java.util.Random;

public class Question13 {

	public static void main(String[] args) {
		int size = 50000;
		int[] num = new int[size];
		Random rand = new Random();
		int temp;
//		System.out.println("Generating " + size + " random numbers...");
		for(int i = 0; i < size; i++) {
			num[i] = rand.nextInt(100000);
		}
		
		System.out.println("Sorting... Please wait. 🕒");
		long startTime = System.nanoTime();
		for(int i=1;i<num.length;i++) {
			for(int j=0;j<num.length-i;j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		float totalTimeSec = (float)totalTime/1000000000;
		System.out.println("\n\nDuration :"+totalTimeSec+" Seconds");
		System.out.println();
//		System.out.println("--After Sorting--\n");
//		for(int i=0;i<num.length;i++) {
//			System.out.print(num[i]+" ");
//		}
	}
	
}
