/*
Question 4: DebugDeck Ticket System (Classes, Constructors & `this`)
Create a basic structure for a bug-tracking tool.
- Create a class named BugTicket.
- Add two instance variables: ticketId (int) and bugDescription (String).
- Create a constructor to initialize these variables. You must use the `this` keyword to differentiate between the local constructor parameters and the instance variable.
- Create a method printTicket() to display the details. 
- In your main method, instantiate an object of BugTicket using the 'new' keyword and call printTicket().
*/
package practice.varad.code;

class BugTicket{
	int ticketId;
	String bugDescription;
	BugTicket(int ticketId, String bugDescription){
		this.ticketId = ticketId;
		this.bugDescription = bugDescription;
	}
	void printTicket(){
		System.out.println("Ticket Created Successfully!");
		System.out.println("Ticket ID : "+ ticketId);
		System.out.println("Bug Description : "+ bugDescription);
	}
}

public class Question4 {

	public static void main(String[] args) {
		BugTicket ticket = new BugTicket(12345,"throws / by 0 exception");
		ticket.printTicket();
	}

}
