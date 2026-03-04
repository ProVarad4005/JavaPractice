/*
Challenge 3: The Hybrid Minecraft Tool (Abstraction + Interfaces)
Let's combine abstraction and multiple inheritance into one super-tool.
- Create an abstract class called MinecraftItem with an abstract method useItem().
- Create two interfaces: Enchantable (with a default method applyUnbreaking() that prints a message) and Repairable (with a default method useAnvil() that prints a message).
- Create a concrete class called NetheritePickaxe that extends the abstract class AND implements both interfaces. 
- Override useItem() to print "Mining obsidian...".
- In your main method, instantiate your pickaxe and call all three methods!
*/
package practice.varad.code;

abstract class MinecraftItem{
	abstract void useItem();
}

interface Enchantable{
	default void applyUnbreaking() {
		System.out.println("Applied unbreaking to ur Item!");
	}
}

interface Repairable{
	default void useAnvil(){
		System.out.println("Repaired your item using an Anvil!");
	}
}

class NetheritePickaxe extends MinecraftItem implements Enchantable,Repairable{
	void useItem(){
		System.out.println("Mining obsidian...");
	}
}

public class Challenge3 {

	public static void main(String[] args) {
		NetheritePickaxe name = new NetheritePickaxe();
		name.useItem();
		name.applyUnbreaking();
		name.useAnvil();
	}

}
