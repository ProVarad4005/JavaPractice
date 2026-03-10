/*
Revision 3: The Background Sync (Multithreading)
Objective: Prove that one thread sleeping does not stop another thread from running.

Rules:
1. Create a class (Revision3) that extends Thread.
2. In the run() method, write a loop from 1 to 5.
3. Inside the loop, print the name of the current thread (using Thread.currentThread().getName()) and the loop counter.
4. Add a Thread.sleep(1000) inside the loop (wrapped in a try-catch block for InterruptedException).
5. In your main() method, create two objects of your class.
6. Name the first one "Game Engine" and the second one "Syncthing".
7. Call .start() on both objects and watch the console output mix together!
*/
package revision.varad.code;

public class Revision3 extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Name: "+Thread.currentThread().getName()+" Loop counter: "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		Revision3 GameEngine = new Revision3();
		Revision3 Syncthing = new Revision3();
		GameEngine.setName("GameEngine");
		Syncthing.setName("Syncthing");
		GameEngine.start();
		Syncthing.start();
	}

}
