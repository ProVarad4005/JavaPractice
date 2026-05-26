/*
Question 6: The Hybrid Player (Interfaces)
Java doesn't support multiple inheritance with classes, but it does with interfaces. Let's build that.
- Create an interface Melee with a default method swingSword() that prints a melee attack message.
- Create an interface Ranged with a default method shootBow() that prints a ranged attack message.
- Create a class Player that implements both interfaces.
- In your main method, instantiate a Player and call both methods.
*/
package practice.varad.code;

interface Melee{
	default void swingSword() {
		System.out.println("You Swinged You Sword!");
	}
}

interface Ranged{
	default void shootBow() {
		System.out.println("You Shot your bow!");
	}
}

class Player implements Melee,Ranged{
	
}

public class Question6 {

	public static void main(String[] args) {
		Player steve = new Player();
		steve.swingSword();
		steve.shootBow();
	}

}