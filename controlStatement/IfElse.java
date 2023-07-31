package controlStatement;
//check age is greater than 18 or not.
import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("your age is greater than 18.");
		} else {
			System.out.println("Your age is less than 18");
		}
	}

}
