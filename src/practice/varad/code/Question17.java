/*
Question 17: The Asynchronous Countdown (Thread Creation & Sleep)
Objective: Create two separate threads that count down simultaneously at different speeds.

Requirements:
1. The Setup: Create Question17.java in 'practice.varad.code'. 
   Create a separate class in the same file (or a new file) named 'CountdownTask' that implements the 'Runnable' interface.
2. The State: Give 'CountdownTask' a String variable called 'taskName' and an int called 'delay'. Create a constructor to set these when the object is created.
3. The Execution: Override the 'public void run()' method.
   - Inside 'run()', create a 'for' loop that counts down from 5 to 1.
   - In the loop, print the 'taskName' and the current number.
   - Use 'Thread.sleep(delay);' to pause the thread. (Remember: sleep throws an InterruptedException, so you MUST wrap it in a try/catch block!).
4. The Main Engine: In your main method, create two instances of 'CountdownTask':
   - Task 1: Name = "Engine A", Delay = 500 (half a second)
   - Task 2: Name = "Engine B", Delay = 1000 (one second)
5. The Launch: Wrap both tasks in 'Thread' objects and call '.start()' on both of them.
*/
package practice.varad.code;

class CountdownTask implements Runnable{
	String taskName;
	int delay;
	CountdownTask(String taskName, int delay){
		this.taskName = taskName;
		this.delay = delay;
	}
	public void run() {
		for(int i=5;i>=1;i--) {
			System.out.println(taskName+""+i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class Question17{

	public static void main(String[] args){
		CountdownTask obj1 = new CountdownTask("Engine A",500);
		CountdownTask obj2 = new CountdownTask("Engine B",1000);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}
