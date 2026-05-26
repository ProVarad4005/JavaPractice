/*
Question 14: Selection Sort
Objective: Sort an array from smallest to largest using the Selection Sort algorithm that Sumit sir taught.

Rules:
1. Here is your starting array: {7, 4, 1, 9, 5}
2. You must use nested loops. 
3. The outer loop (i) tracks the current position you are trying to fill.
4. The inner loop (j) scans the remaining numbers to find the index of the absolute smallest number (your 'chotu' index).
5. After the inner loop finishes scanning, swap the number at your current 'i' position with the number at the 'chotu' index.
6. Print the completely sorted array at the end.
*/
package practice.varad.code;

public class Question14 {
	
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

	public static void main(String[] args) {
		int array[]= {7,4,1,9,5};
		System.out.println("---Before Sorting---");
		for(int p:array) {
			System.out.print(p+" ");
		}
		SelectionSort(array);
		System.out.println("\n---After Sorting---");
		for(int p:array) {
			System.out.print(p+" ");
		}
	}

}
