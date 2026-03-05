/*
Question 16: The VIP Race (Priorities & Join)
Objective: Set thread priorities and force the main thread to wait for them to finish.

Rules:
1. Create a class (Question16) that extends Thread.
2. In the run() method, print the thread's name and a loop counter from 1 to 5. (No sleep needed this time, let them run as fast as possible to test priority).
3. In main(), create two thread objects (e.g., t1 and t2).
4. Name them using t1.setName("VIP Thread") and t2.setName("Standard Thread").
5. Set t1 to MAX_PRIORITY (10) and t2 to MIN_PRIORITY (1).
6. Start both threads.
7. Use t1.join() and t2.join() right after starting them. (Hint: join() also throws an InterruptedException, so it needs a try-catch block!).
8. As the very last line of your main() method, print "Main Thread: The race is over!"
*/
package practice.varad.code;

public class Question16 extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Name : "+Thread.currentThread().getName()+", loop counter : "+i);
		}
	}
	
	public static void main(String[] args) {
		Question16 t1 = new Question16();
		Question16 t2 = new Question16();
		t1.setName("VIP Thread");
		t2.setName("Standard Thread");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (Exception e) {
			
		}
		try {
			t2.join();
		} catch (Exception e) {
			
		}
		System.out.println("Main Thread: The race is over!");
	}

}
