/*
Revision 2: Sorting the Server Ping (Selection Sort)
Objective: Sort an unsorted array of numbers from lowest to highest using nested loops.

Rules:
1. Your starting array of ping times: {120, 45, 200, 15, 60}
2. Use an outer loop (i) to track the current position you are trying to fill.
3. Use an inner loop (j) starting from (i + 1) to scan the rest of the array.
4. Track the index of the absolute smallest number using an integer variable (like 'chotu' or 'minIndex').
5. Every time you find a smaller number in the inner loop, update 'minIndex'.
6. After the inner loop finishes, swap the number at your current 'i' position with the number at 'minIndex'.
7. Print the completely sorted array at the end using an enhanced for-loop or Arrays.toString().
*/
package revision.varad.code;

public class Revision2 {

	public static void main(String[] args) {
		int ping[]= {120,45,200,15,60},chotu,temp;
		System.out.println("Initial Array:");
		for(int i=0;i<ping.length;i++) {
			System.out.print(ping[i]+" ");
		}
		for(int i=0;i<ping.length;i++) {
			chotu =i;
			for(int j=i+1;j<ping.length;j++) {
				if (ping[chotu]>ping[j]) {
					chotu=j;
				}
			}
			if(chotu!=i) {
				temp=ping[chotu];
				ping[chotu]=ping[i];
				ping[i]=temp;
			}
		}
		System.out.println("\nSorted Array:");
		for(int i=0;i<ping.length;i++) {
			System.out.print(ping[i]+" ");
		}
	}

}
