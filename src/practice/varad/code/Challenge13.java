/*
Challenge 13: The P2P Folder Sync (Advanced Multithreading)
Objective: Simulate syncing files between a PC and an Android phone. Some files can sync at the same time, but the final backup MUST wait for the others.

Rules:
1. Create a class (Challenge13) that extends Thread, with a parameterized constructor to set the thread's name (like you did in Megaquestion 4).
2. In run(), print the thread's name + " is syncing...", sleep for 2000ms, then print the name + " finished!".
3. In main(), create three threads: "Photos", "Documents", and "System Backup".
4. The Catch: "Photos" and "Documents" should sync AT THE SAME TIME (asynchronously). 
5. "System Backup" cannot start until BOTH "Photos" and "Documents" are 100% finished.
6. Hint: You will need to start() both of the first two threads before you call join() on anything!
*/
package practice.varad.code;

public class Challenge13 extends Thread{
	
	Challenge13(String threadName){
		this.setName(threadName);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is syncing...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+" finished!");
	}

	public static void main(String[] args) {
		Challenge13 obj1 = new Challenge13("Photos");
		Challenge13 obj2 = new Challenge13("Documents");
		Challenge13 obj3 = new Challenge13("System Backup");
		try {
			obj1.start();
			obj2.start();
			obj1.join();
			obj2.join();
			obj3.start();
			obj3.join();
		} catch (Exception e) {
			
		}
	}

}
