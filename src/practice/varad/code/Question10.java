/*
Question 10: The Scalable System (Loose Coupling)
Let's break the glue and pass the data in from the outside.
- Keep your MySQLDatabase class exactly the same as before.
- Inside BugTracker, declare an instance variable for the database (e.g., `MySQLDatabase db;`), but DO NOT initialize it with the `new` keyword.
- Create a constructor for BugTracker that accepts a MySQLDatabase object as a parameter and assigns it to your instance variable (remember your `this` keyword!).
- In your startSystem() method, just call db.connect().
- In your main method, you must now instantiate the MySQLDatabase FIRST.
- Then, instantiate the BugTracker and pass the database object directly into its constructor.
- Finally, call startSystem().
*/
package practice.varad.code;

class MySQLDatabase10{
	void connect(){
		System.out.println("Connected to MySQL");
	}
}

class BugTracker10{
	MySQLDatabase10 db;
	BugTracker10(MySQLDatabase10 db){
		this.db=db;
	}
	void startSystem() {
		db.connect();
	}
}

public class Question10 {

	public static void main(String[] args) {
		MySQLDatabase10 db = new MySQLDatabase10();
		BugTracker10 bt = new BugTracker10(db);
		bt.startSystem();
	}

}
