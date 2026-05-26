/*
Challenge 4: The Armstrong Vault (Loops & Math)
An Armstrong number is a number whose sum of the cube of its every digit is the same number. 
- Write a program using a `while` loop to check if a specific, hard-coded 3-digit number (like 153) is an Armstrong number.
- Hint 1: Create variables for the original number, the remainder (for individual digits), and the final result (sum of cubes).
- Hint 2: Inside the loop, use the modulo operator (`% 10`) to extract the last digit.
- Hint 3: Cube that digit and add it to your total result.
- Hint 4: Use division (`/ 10`) to remove that last digit from the number so the loop can process the next one.
*/
package practice.varad.code;

public class Challenge4 {

	public static void main(String[] args) {
		int num=153,sum=0,rem,temp=num;
		while(temp>0) {
			rem=temp%10;
			temp/=10;
			sum+=rem*rem*rem;
		}
		if (sum == num) {
			System.out.println(num+" Is an Armstrong Number!");
		}
		else {
			System.out.println(num+" Is not an Armstrong Number");
		}
	}

}
