/*
Challenge 5: The Palindrome Array
Objective: Check if an array reads the exact same forwards and backwards.

Rules:
1. Here is your starting array: {1, 2, 3, 2, 1}
2. You need to figure out if it is a palindrome (symmetrical).
3. Use a boolean flag to track if you find a mismatch.
4. If it is a palindrome, print "It is a palindrome!". If not, print "It is NOT a palindrome!".
*/
package practice.varad.code;

public class Challenge5 {

	public static void main(String[] args) {
		int array[]= {1,2,3,2,1},left=0,right=array.length-1;
		boolean Palindrome = true;
		while(left<right) {
			if(array[left]!=array[right]) {
				Palindrome = false;
				break;
			}
			left++;
			right--;
		}
		if(Palindrome) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("It is NOT a palindrome!");
		}
	}

}
