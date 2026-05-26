/*
Mega Question 1: The Universal Notifier
Objective: Build a system where the "Notification Logic" is completely 
separated from the "Sending Logic" (Loose Coupling).

1. The POJO (Encapsulation):
   - Create a class 'AlertMessage'.
   - Add private String variables: 'recipient' and 'content'.
   - Create a Constructor to initialize both.
   - Create Getters for both (No setters needed).

2. The Interface (Abstraction):
   - Create an interface 'NotificationService'.
   - Add one abstract method: void send(AlertMessage msg);

3. The Implementations:
   - Create class 'EmailService' that implements 'NotificationService'. 
     Override send() to print: "Email sent to [recipient]: [content]".
   - Create class 'SMSService' that implements 'NotificationService'. 
     Override send() to print: "SMS sent to [recipient]: [content]".

4. The Loosely Coupled Class (Dependency Injection):
   - Create class 'UserAlertSystem'.
   - Add a private variable of type 'NotificationService' (The Interface!).
   - Create a Constructor for 'UserAlertSystem' that accepts a 'NotificationService' object.
   - Add a method 'processAlert(String to, String text)' that:
     a) Creates a new 'AlertMessage' object.
     b) Calls the service's send() method using that message.

5. The Main Method:
   - In MegaQuestion1's main, create an 'EmailService' object.
   - Pass it into a new 'UserAlertSystem'.
   - Call processAlert("Varad", "Your code is cooking!").
*/
package practice.varad.code;

class AlertMessage{
	private String recipient,content;
	AlertMessage(String recipient, String content){
		this.recipient=recipient;
		this.content=content;
	}
	public String getRecipient() {
		return recipient;
	}
	public String getContent() {
		return content;
	}
}

interface NotificationService{
	void send(AlertMessage msg);
}

class EmailService implements NotificationService{
	public void send(AlertMessage msg) {
		System.out.println("Email sent to "+msg.getRecipient()+" : "+msg.getContent());
	}
}

class SMSService implements NotificationService{
	public void send(AlertMessage msg) {
		System.out.println("SMS sent to "+msg.getRecipient()+" : "+msg.getContent());
	}
}

class UserAlertSystem{
	private NotificationService ns;
	UserAlertSystem(NotificationService ns){
		this.ns = ns;
	}
	void processAlert(String to, String text) {
		AlertMessage am = new AlertMessage(to,text);
		ns.send(am);
		
	}
}

public class MegaQuestion1 {

	public static void main(String[] args) {
		EmailService es = new EmailService();
		SMSService ss = new SMSService();
		UserAlertSystem uas1 = new UserAlertSystem(es);
		uas1.processAlert("Varad","Your code is cooking!");
		UserAlertSystem uas2 = new UserAlertSystem(ss);
		uas2.processAlert("Shivam","Your game is cooking!");
	}

}
