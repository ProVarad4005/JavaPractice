/*
Question 11: The Stat Analyzer (Min, Max, and Average)
Objective: Traverse an array to find specific values in a single pass (O(n) time complexity).

1. Create an array of integers representing your kills in the last 7 Bedwars matches: 
   {12, 4, 19, 7, 15, 22, 9}
2. Initialize three variables:
   - 'max' (set it to the first element of the array, e.g., arr[0])
   - 'min' (set it to the first element of the array)
   - 'sum' (set it to 0)
3. Use a single 'for' loop to iterate through the array:
   - If the current number is greater than 'max', update 'max'.
   - If the current number is less than 'min', update 'min'.
   - Add the current number to 'sum'.
4. After the loop finishes, calculate the average (sum / length).
   - Hint: Cast the sum to a float or double before dividing so you don't lose the decimals!
5. Print out your Highest Kill game, Lowest Kill game, and Average Kills.
*/
package practice.varad.code;

public class Question11 {

	public static void main(String[] args) {
		int kills[] = {12,4,19,7,15,22,9},max=kills[0],min=kills[0],sum=0;
		for(int i=0;i<kills.length;i++) {
			if (kills[i]>max) {
				max = kills[i];
			}
			if (kills[i]<min) {
				min = kills[i];
			}
			sum+=kills[i];
		}
		float average = (float)sum/kills.length;
		System.out.println("Maximum Kills = "+max);
		System.out.println("Minimum Kills = "+min);
		System.out.println("Average Kills = "+average);
	}

}
