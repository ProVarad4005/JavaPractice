/*
Challenge 5: DebugDeck Secure Profile (Encapsulation & POJO)
Let's build a secure Bean class to store user login data for DebugDeck.
- Create a POJO class named UserProfile.
- Add two `private` instance variables: username (String) and password (String).
- Generate `public` getters and setters for both variables. (Try using that IDE shortcut your classmate wrote down: Right click -> Source -> Generate getters and setters!)
- Create a separate main class (e.g., ProfileTest) with your `main` method.
- Inside `main`, instantiate a UserProfile object.
- Use the setter methods to assign a username and password.
- Use the getter method to print ONLY the username to the console (keep the password hidden!).
*/
package practice.varad.code;

class UserProfile{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class Question8 {

	public static void main(String[] args) {
		UserProfile varad = new UserProfile();
		varad.setUsername("Varad");
		varad.setPassword("idktbh");
		System.out.println("Username = "+varad.getUsername());
	}

}
