/*
Write a Java program that imports the Scanner class to take user input.
Ask the user for their total kills and total deaths in 1v1 matches.
*/

package practice.varad.code;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kills,deaths;
		float kd;
		System.out.println("---Welcome to k/d checker---");
		System.out.println("Enter Total Kills:");
		kills = sc.nextInt();
		System.out.println("Enter Total Deaths:");
		deaths = sc.nextInt();
		if(deaths == 0) {
			kd = kills;
		}
		else {
			kd = (float)kills/(float)deaths;
		}
		System.out.println(kd);
		if(kd >= 1.5 && kills>100) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}