/*
Question 7: Server Ping Check (Exception Handling & `finally`)
Write a program to check server latency.
- Ask the user to input their current ping (using `Scanner`).
- Wrap the logic in a `try-catch` block. 
- Inside the `try` block, if the ping is greater than 300, manually `throw` an `ArithmeticException` with a custom message like "Ping too high! Disconnected."
- Catch the exception and print the error message.
- Add a `finally` block that prints "Network diagnostics complete." regardless of whether the exception was thrown or not.
*/
package practice.varad.code;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ping : ");
		int ping = sc.nextInt();
		try {
			try {
				if(ping<0) {
					throw new ArithmeticException("Ping Cannot be lesser than 0!"); 
				}
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			if (ping>=200) {
				throw new ArithmeticException("Ping too high! Disconnected.");
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Network diagnostics complete.");
		}
		if (ping>=0 && ping<=100) {
			System.out.println("You Have a good Ping!");
		} 
		else if(ping>100 && ping<=200){
			System.out.println("You Have a bad Ping!");
		}
	}
}
