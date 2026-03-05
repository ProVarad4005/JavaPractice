/*
Question 15: The Racing Threads
Objective: Create two threads that run concurrently and watch their outputs mix together.

Rules:
1. Create your class (Question15) and make it extend Thread.
2. Override the public void run() method.
3. Inside run(), write a loop that prints the current Thread's ID (using Thread.currentThread().getId()) or a custom name 5 times.
4. Inside the loop, use Thread.sleep(1000) to make the thread pause for 1 second between prints. (Wrap this in a try-catch for InterruptedException!)
5. In your main() method, create TWO separate objects of Question15.
6. Call .start() on both objects.
*/
package practice.varad.code;

public class Question15 extends Thread {
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread ID:"+Thread.currentThread().threadId());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		Question15 obj = new Question15();
		obj.start();
		Question15 obj1 = new Question15();
		obj1.start();
	}

}
