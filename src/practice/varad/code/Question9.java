/*
Question 9: The Glued System (Tight Coupling)
Let's build a tightly coupled system to see exactly what NOT to do in large apps.
- Create a class called MySQLDatabase with a method connect() that prints "Connected to MySQL".
- Create a class called BugTracker.
- Inside BugTracker, DO NOT pass the database in from the outside. Instead, create a method called startSystem().
- Inside startSystem(), instantiate the MySQLDatabase object directly using the 'new' keyword and call connect(). (This completes the binding and creates Tight Coupling!)
- In your main method, instantiate BugTracker and call startSystem().
*/
package practice.varad.code;

class MySQLDatabase{
	void connect(){
		System.out.println("Connected to MySQL");
	}
}

class BugTracker{
	void startSystem() {
		MySQLDatabase db = new MySQLDatabase();
		db.connect();
	}
}

public class Question9 {

	public static void main(String[] args) {
		BugTracker bt = new BugTracker();
		bt.startSystem();
	}

}
