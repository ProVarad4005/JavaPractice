/*
Challenge 7: The Runner-Up (Second Largest Element)
Objective: Find the SECOND largest number in an array.

Rules:
1. Here is your array: {12, 35, 1, 10, 34, 1}
2. You CANNOT use Arrays.sort() or any sorting algorithm.
3. You must find the answer using only ONE single loop (O(n) time complexity).
4. Print the second largest number at the end.
*/
package practice.varad.code;

public class Challenge7 {

	public static void main(String[] args) {
		int array[]= {99,12,35,1,10,34,1},greatest1=Integer.MIN_VALUE,greatest2=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(greatest1 < array[i]) {
				greatest2 = greatest1;
				greatest1 = array[i];
			}
			else if(array[i]<greatest1 && array[i]>greatest2) {
				greatest2 = array[i];
			}
		}
		System.out.println("Second Greatest Number : "+greatest2);
	}

}
