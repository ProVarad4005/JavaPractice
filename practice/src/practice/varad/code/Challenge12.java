/*
Challenge 12: The Auto-Mod Chat Filter (Strings & Arrays)
Objective: Build a simple chat filter for a server lobby that censors specific toxic words.

Rules:
1. You have an array of incoming chat messages: 
   String[] chatLog = {"gg", "ez", "nice shot", "hacker", "lag"};
2. You need to loop through the array and check every message.
3. If a message is EXACTLY "ez" or EXACTLY "hacker", replace that element in the array with "***".
4. Print the final cleaned chat log.
5. The Catch: Remember the invisible trap from the last Megaquestion. You are comparing Strings, so you CANNOT use ==. You must use the correct String comparison method!
*/
package practice.varad.code;

public class Challenge12 {

	public static void main(String[] args) {
		String chatLog[]= {"gg","ez","nice shot","hacker","lag"};
		System.out.println("Initial Chat Log :");
		for(int i=0;i<chatLog.length;i++) {
			System.out.println(chatLog[i]);
		}
		for(int i=0;i<chatLog.length;i++) {
			if (chatLog[i].equals("ez") || chatLog[i].equals("hacker")) { //or chatLog[i].equalsIgnoreCase("ez/hacker")
				chatLog[i]="***";
			}
		}
		System.out.println("\nCleaned Chat Log :");
		for(int i=0;i<chatLog.length;i++) {
			System.out.println(chatLog[i]);
		}
	}

}
