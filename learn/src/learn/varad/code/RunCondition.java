/*
Concept Test: The Dupe Glitch (Race Conditions & Synchronization)
Objective: Prove that multithreading is dangerous without memory locks, then fix the glitch.

Requirements:
1. Setup: Create a class named RunCondition inside your 'learn.varad.code' package that extends Thread.
2. Shared Data: Create a static integer variable called 'serverTickets' and set it to 10000.
3. The Action: Create a static method called bookTicket() that simply decreases serverTickets by 1 (serverTickets--;).
4. The Thread Logic: In your run() method, create a 'for' loop that runs exactly 5000 times. Inside the loop, call bookTicket().
5. The Pipeline (main method): 
   - Instantiate two RunCondition threads.
   - start() both of them.
   - join() both of them so the main thread waits for them to finish.
   - Print the final value of serverTickets.

PHASE 1 (The Glitch): Run the code exactly as written. Mathematically, 10000 - 5000 - 5000 = 0. But because both threads are overwriting the data simultaneously, they will corrupt the count. 

PHASE 2 (The Patch): Add the 'synchronized' keyword to your bookTicket() method signature: 
static synchronized void bookTicket()
Run it again to see the perfect 0.
*/
package learn.varad.code;

public class RunCondition extends Thread{
	
	static int serverTickets = 10000;
	
	static synchronized void bookTicket() {
		serverTickets--;
	}
	
	public void run() {
		for(int i=0;i<5000;i++) {
			bookTicket();
		}
	}
	
	public static void main(String[] args) {
		RunCondition obj1 = new RunCondition();
		RunCondition obj2 = new RunCondition();
		try {
			obj1.start();
			obj2.start();
			obj1.join();
			obj2.join();
		} catch (Exception e) {
			
		}
		System.out.println(serverTickets);
	}

}
