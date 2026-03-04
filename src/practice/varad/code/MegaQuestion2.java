/*
Megaquestion2: The Chaos Pair (Selection Sort + Two-Pointers)
Objective: Find two numbers that add up to a target in an unsorted array without using brute force.

Rules:
1. Your starting array: {18, 4, 11, 2, 25, 9, 14}
2. Your target sum: 20
3. Phase 1: You MUST sort the array first using the Selection Sort logic you just mastered. 
4. Phase 2: Once sorted, use your Two-Pointer (left and right) logic to find the exact two numbers that add up to 20. 
5. You CANNOT use a nested loop to find the sum.
6. Print the sorted array first, then print the two winning numbers.
*/
package practice.varad.code;

public class MegaQuestion2 {
	public static void SelectionSort(int array[]) {
		int chotu,temp;
		for(int i=0;i<array.length-1;i++) {
			chotu=i;
			for(int j=i+1;j<array.length;j++) {
				if (array[j]<array[chotu]) {
					chotu=j;
				}
			}
			if (chotu!=i) {
				temp=array[chotu];
				array[chotu]=array[i];
				array[i]=temp;
			}
		}
	}
	public static void AddUpTo(int array[],int sum) {
		int left=0,right=array.length-1;
		boolean found=false;
		while(left<right) {
			if(sum<array[left]+array[right]) {
				right--;
			}
			else if(sum>array[left]+array[right]) {
				left++;
			}
			else {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("\nThe two numbers in the array that add up to "+sum+" are : "+array[left]+" and "+array[right]);
		}
		else {
			System.out.println("\nNo two numbers in the array add up to "+sum);
		}
	}
	public static void main(String[] args) {
		int array[]={18, 4, 11, 2, 25, 9, 14},sum=20;
		SelectionSort(array);
		System.out.println("---Sorted Array---");
		for(int p:array) {
			System.out.print(p+" ");
		}
		AddUpTo(array,sum);
	}

}
