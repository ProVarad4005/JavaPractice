/*
Megaquestion 3: The Server Optimization Pipeline (Arrays + Multithreading)
Objective: Create a multithreaded server startup sequence that runs two different array algorithms sequentially.

Rules:
1. Create a class called Megaquestion3 that extends Thread.
2. Inside the class (above your methods, so both threads can see them), create two arrays:
   int[] pings = {150, 30, 85, 12, 200};
   int[] kills = {3, 0, 7, 0, 14, 0, 2};
3. In your run() method, use an if-else statement to check the thread's name using Thread.currentThread().getName().
4. If the name is "Ping Sorter": 
   - Run your Selection Sort logic to sort the 'pings' array from lowest to highest.
   - Print the final sorted pings array.
5. If the name is "Lobby Cleaner":
   - Run your pointer logic to push all the 0s in the 'kills' array to the end.
   - Print the final cleaned kills array.
6. In main(), create two thread objects of Megaquestion3. Name the first one "Ping Sorter" and the second one "Lobby Cleaner".
7. Using start() and join(), force the "Ping Sorter" to run and finish completely BEFORE the "Lobby Cleaner" is allowed to start.
8. After both threads are completely finished, have the main thread print: "Server optimization complete. Ready for players!"
*/
package practice.varad.code;

public class MegaQuestion3 extends Thread{
	static int pings[]= {150,30,85,12,200},kills[]= {3,0,7,0,14,0,2};
	void PingSorter(int pings[]) {
		int temp,chotu;
		for(int i=0;i<pings.length;i++) {
			chotu=i;
			for(int j=i+1;j<pings.length;j++) {
				if (pings[j]<pings[chotu]) {
					chotu=j;
				}
			}
			if(chotu!=i) {
				temp = pings[chotu];
				pings[chotu]=pings[i];
				pings[i]=temp;
			}
		}
	}
	void LobbyCleaner(int kills[]) {
		int temp,index=0;
		for(int i=0;i<kills.length;i++) {
			if (kills[i]!=0) {
				temp = kills[i];
				kills[i]=kills[index];
				kills[index]=temp;
				index++;
			}
		}
	}
	public void run() {
		if (Thread.currentThread().getName().equals("Ping Sorter")) {
			System.out.println("\nInitial Ping Array :");
			for(int i=0;i<pings.length;i++) {
				System.out.print(pings[i]+" ");
			}
			PingSorter(pings);
			System.out.println("\nSorted Ping Array :");
			for(int i=0;i<pings.length;i++) {
				System.out.print(pings[i]+" ");
			}
		}
		else if(Thread.currentThread().getName().equals("Lobby Cleaner")){
			System.out.println("\nInitial Lobby :");
			for(int i=0;i<kills.length;i++) {
				System.out.print(kills[i]+" ");
			}
			LobbyCleaner(kills);
			System.out.println("\nCleared Lobby :");
			for(int i=0;i<kills.length;i++) {
				System.out.print(kills[i]+" ");
			}
		}
		else {
			System.out.println("Invalid Thread");
		}
	}
	public static void main(String[] args) {
		MegaQuestion3 name1 = new MegaQuestion3();
		MegaQuestion3 name2 = new MegaQuestion3();
		name1.setName("Ping Sorter");
		name2.setName("Lobby Cleaner");
		System.out.println("Welcome to NetherGames!");
		try {
			name1.start();
			name1.join();
			name2.start();
			name2.join();
		}
		catch(Exception e){
			
		}
		finally {
			System.out.println("\n\nServer optimization complete. Ready for players!");
		}
	}

}
