/*
Challenge 9: The Target Pair
Objective: Find two numbers in an array that add up to a specific target number.

Rules:
1. Here is your array of match scores: {2, 7, 11, 15, 22, 30}
2. Your target sum is: 26
3. You need to find the exact two numbers that add up to 26 and print their values.
4. You CANNOT use the exact same array index twice to get the sum.
5. Print the two numbers when you find them.
*/
package practice.varad.code;

public class Challenge9 {

	public static void main(String[] args) {
//		Brute force way
		int scores[]= {2,7,11,15,22,30},num1=0,num2=0,sum=26;
		boolean found=false;
		for(int i=0;i<scores.length;i++) {
			num1 = scores[i];
			for(int j=0;j<scores.length;j++) {
				if(j!=i) {
					num2 = scores[j];
				}
				if(num1+num2==sum) {
					found = true;
					break;
				}
			}
			if(found == true) {
				break;
			}
		}
		if(num1+num2==sum) {
			System.out.println("The two numbers that add up to "+sum+" : "+" : "+num1+" "+num2);
		}
		else {
			System.out.println("No two numbers add up to 26!");
		}
//		Two-pointer method
		int scores1[]= {2,7,11,15,22,30},left=0,right=scores1.length-1;
		boolean found1=false;
		while(left<right) {
			if(scores1[left]+scores1[right]==sum) {
				found1 = true;
				break;
			}
			else if(scores1[left]+scores1[right]<sum){
				left++;
			}
			else if(scores1[left]+scores1[right]>sum){
				right--;
			}
		}
		if(found1) {
			System.out.println("The two numbers that add up to "+sum+" : "+" : "+scores1[left]+" "+scores1[right]);
		}
		else {
			System.out.println("No two numbers add up to 26!");
		}
	}
}
