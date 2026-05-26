/*
Challenge 1: The CODM Loadout (Classes, Methods, & Logic)
Let's build a weapon stats calculator.
- Create a class called AssaultRifle.
- Add instance variables for weaponName (String), baseDamage (int), and rangeMultiplier (float). 
- Use a constructor with the `this` keyword to initialize these variables, differentiating them from the local variables.
- Create a method called calculateDamage(int distance). If the distance is greater than 50 meters, reduce the baseDamage by dividing it by the rangeMultiplier. 
- Instantiate your favorite gun in the main method, check its damage at 20 meters and 60 meters, and print the results.
*/
package practice.varad.code;

class AssaultRifle{
	String weaponName;
	int baseDamage;
	float rangeMultiplier;
	AssaultRifle(String weaponName, int baseDamage, float rangeMultiplier){
		this.weaponName = weaponName;
		this.baseDamage = baseDamage;
		this.rangeMultiplier = rangeMultiplier;
	}
	int calculateDamage(int distance) {
		int effectiveDamage = baseDamage;
		if (distance>50) {
			effectiveDamage/=rangeMultiplier;
		}
		System.out.println("Damage at "+distance+"m = "+effectiveDamage);
		return effectiveDamage;
	}
}

public class Challenge1 {
	public static void main(String[] args) {
		AssaultRifle rifle = new AssaultRifle("M4",30,1.2f);
		rifle.calculateDamage(40);
		rifle.calculateDamage(60);
	}
}
