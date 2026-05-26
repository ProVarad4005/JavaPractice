/*
Question 18: The Joint Account (Synchronization)
Client Request:
"We need a banking simulation to demonstrate race conditions. 

Create a system where a single Bank Account starts with a balance of $100. 
Two separate users (threads) share this exact same account. Both users need to attempt to withdraw $70 at the exact same time.

To simulate our slow bank servers, the withdrawal process takes about 100 milliseconds to complete (from the time the system checks the balance to the time it actually subtracts the money). 

Phase 1 (The Bug): 
Write the system so that it fails. Because of the 100ms server delay, both users should successfully check the balance, see $100, and withdraw $70, leaving the account at a corrupted -$40.

Phase 2 (The Fix): 
Apply the proper Java keyword to lock down the transaction. When fixed, User 1 should successfully withdraw $70, and User 2 should be blocked and receive an 'Insufficient Funds' message."

Technical Requirements:
1. Create Question18.java in 'practice.varad.code'.
2. Create a 'BankAccount' class with a private balance of 100 and a 'withdraw(int amount)' method containing a 100ms Thread.sleep().
3. Create an 'AccountHolder' class that implements 'Runnable' and calls the withdraw method.
4. In main(), create ONE BankAccount, pass it to TWO Threads (e.g., "Person 1" and "Person 2"), and start them.
5. Fix the bug using the 'synchronized' keyword on the withdraw method.
*/
package practice.varad.code;

class BankAccount{
	private int balance = 100;
	synchronized void withdraw(int amount) {
		if (amount<=balance) {
			System.out.println(Thread.currentThread().getName()+" is withdrawing...");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			balance-=amount;
			System.out.println("Remaining Amount: "+balance);
		}
		else {
			System.out.println("Insufficient funds for "+Thread.currentThread().getName());
		}
	}
}

class AccountHolder implements Runnable{
	BankAccount sharedAccount;
	int amount;
	AccountHolder(BankAccount account,int amount){
		this.sharedAccount = account;
		this.amount = amount;
	}
	public void run() {
		sharedAccount.withdraw(amount);
	}
}

public class Question18 {

	public static void main(String[] args) {
		BankAccount jointAccount = new BankAccount();
		AccountHolder h1 = new AccountHolder(jointAccount,70);
		AccountHolder h2 = new AccountHolder(jointAccount,70);
		Thread t1 = new Thread(h1,"Person 1");
		Thread t2 = new Thread(h2,"Person 2");
		t1.start();
		t2.start();
	}

}
