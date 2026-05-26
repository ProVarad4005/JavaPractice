/*
Revision 1: The CP Calculator (Two-Pointer Method)
Objective: Find two numbers in a sorted array that add up to a specific target sum.

Rules:
1. Your sorted array of CP draw costs: {30, 80, 120, 300, 500}
2. Your target sum: 420
3. You must use the left and right pointer logic (while left < right). No nested loops allowed!
4. If the sum of the pointers is too small, move the left pointer.
5. If the sum is too big, move the right pointer.
6. When you find the exact match, print: "Match found: [num1] and [num2] CP" and break the loop.
*/
package revision.varad.code;

public class Revision1 {

	public static void main(String[] args) {
		int draw_cost[]= {30,80,120,300,500},left=0,right=draw_cost.length-1,sum=420;
		boolean matched=false;
		while(left<right) {
			if (draw_cost[left]+draw_cost[right]>sum) {
				right--;
			}
			else if (draw_cost[left]+draw_cost[right]<sum) {
				left++;
			}
			else {
				matched = true;
				break;
			}
		}
		if (matched) {
			System.out.println("The numbers that add up to "+sum+" are "+draw_cost[left]+" and "+draw_cost[right]);
		}
		else {
			System.out.println("No numbers in the array add up to "+sum);
		}
		
	}

}
