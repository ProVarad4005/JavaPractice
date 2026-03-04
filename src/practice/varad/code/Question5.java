/*
Question 5: Weapon Mechanics (Abstraction & Overriding)
Implement abstraction to hide complexity.
- Create an abstract class called GameEntity that contains an abstract method spawn().
- Create a concrete class called Zombie that extends GameEntity.
- Override the spawn() method inside Zombie to print "Zombie has spawned in the arena!".
- In your main method, create an object of Zombie and call spawn(). 
(Remember, you cannot create an object of the abstract class directly!)
*/
package practice.varad.code;

abstract class GameEntity{
	abstract void spawn();
}

class Zombie extends GameEntity{
	void spawn() {
		System.out.println("Zombie has spawned in the arena!");
	}
}

public class Question5 {

	public static void main(String[] args) {
		Zombie obj = new Zombie();
		obj.spawn();
	}

}
