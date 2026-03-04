/*
Question 12: The In-Place Reversal (Two-Pointer Technique)
Objective: Physically reverse the elements of an array in memory without creating a second array (O(n) time, O(1) space).

1. Create an array of integers (e.g., your recent match kill counts): {5, 12, 9, 18, 22, 7}.
2. Set up two integer variables to act as your "pointers":
   - 'left' starting at the first index (0).
   - 'right' starting at the last index (length - 1).
3. Use a 'while' loop that continues ONLY as long as 'left' < 'right':
   - Swap the element at arr[left] with the element at arr[right] using a 'temp' variable.
   - Move the 'left' pointer forward (left++).
   - Move the 'right' pointer backward (right--).
4. Print the array before the loop and after the loop to prove the array itself was permanently altered.
*/
package practice.varad.code;

public class Question12 {

	public static void main(String[] args) {
		int kills[]= {5,12,9,17,18,22,7},left=0,right=kills.length-1,temp;
		System.out.println("--Before Reversing--");
		for(int i=0;i<kills.length;i++) {
			System.out.print(kills[i]+" ");
		}
		while (left<right) {
			temp = kills[right];
			kills[right] = kills[left];
			kills[left] = temp;
			left++;
			right--;
		}
		System.out.println("\n--After Reversing--");
		for(int i=0;i<kills.length;i++) {
			System.out.print(kills[i]+" ");
		}
	}

}
