/*
Challenge 11: The DebugDeck Build Sequence (Multithreading)
Objective: Simulate a project deployment where certain tasks absolutely MUST finish before the next one can start.

Rules:
1. Create your class (Challenge11) and make it extend Thread.
2. In the run() method, print the thread's name + " is building...". 
3. Make the thread sleep for 1000ms (remember the try-catch block for InterruptedException).
4. After waking up, print the thread's name + " is complete!".
5. In main(), create three threads and name them: "Database Design", "Flask Backend", and "HTML/CSS Frontend".
6. The Catch: They cannot run at the same time. The Backend cannot start until the Database is completely finished. The Frontend cannot start until the Backend is completely finished.
7. Use your start() and join() methods strategically in main() to force this exact sequence.
*/
package practice.varad.code;

public class Challenge11 extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName()+" is building...");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			
		}
		System.out.println(Thread.currentThread().getName()+" is complete!");
	}
	
	public static void main(String[] args) {
		Challenge11 obj1 = new Challenge11();
		Challenge11 obj2 = new Challenge11();
		Challenge11 obj3 = new Challenge11();
		obj1.setName("Database Design");
		obj2.setName("Flask Backend");
		obj3.setName("HTML/CSS Frontend");
		try {
			obj1.start();
			obj1.join();
			obj2.start();
			obj2.join();
			obj3.start();
			obj3.join();
		}
		catch(Exception e) {
			
		}
	}

}
