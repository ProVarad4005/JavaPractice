/*
Challenge 10: Bedwars Scoreboard Cleanup (Arrays)
Objective: Move all the disconnected players (represented by 0 kills) to the bottom of the leaderboard without messing up the order of the active players.

Rules:
1. Your starting array of player kills: {0, 12, 0, 5, 9, 0, 20}
2. You CANNOT create a second empty array to solve this. You must modify the original array in-place.
3. The final output must look exactly like this: {12, 5, 9, 20, 0, 0, 0}
4. Hint: Use a single integer variable to keep track of the index where the next non-zero number belongs. Loop through the array, and whenever you find a number that isn't 0, swap it or place it at that tracked index, then move the index forward!
*/
package practice.varad.code;

public class Challenge10 {

	public static void main(String[] args) {
		int player_kills[]= {0,12,0,5,9,0,20},temp,index=0;
		System.out.println("Initial Array: ");
		for(int i=0;i<player_kills.length;i++) {
			System.out.print(player_kills[i]+" ");
		}
		for(int i=0;i<player_kills.length;i++) {
			if (player_kills[i]!=0) {
				temp = player_kills[i];
				player_kills[i] = player_kills[index];
				player_kills[index] = temp;
				index++;
			}
		}
		System.out.println("\nCleaned Array: ");
		for(int i=0;i<player_kills.length;i++) {
			System.out.print(player_kills[i]+" ");
		}
	}

}
