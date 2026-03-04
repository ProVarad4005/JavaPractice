/*
Challenge 2: DebugDeck Server Protocol (Nested Try-Catch & `throws`)
Time to handle some intense backend server logic!
- Create a method called connectToServer() and use the `throws` keyword specified with the method declaration to identify possible exceptions. Have it manually `throw` an ArithmeticException inside the method.
- In your main method, wrap your logic in a nested try-catch block (an outer try-catch, with another try-catch inside the outer 'try').
- Inside the inner 'try' block, force an error (like division by zero: int x = 5 / 0;) and catch it.
- After the inner try-catch block (but still inside the outer 'try'), call your connectToServer() method.
- Catch the exception thrown by connectToServer() in the outer 'catch' block.
*/
package practice.varad.code;

public class Challenge2 {
	static void connectToServer() throws ArithmeticException
	{
		throw new ArithmeticException("Error Occured when connecting to server!");
	}
	public static void main(String[] args) {
		try {
			try {
				int x=5/0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			connectToServer();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
