package classTest;

//question-5
import java.util.Scanner;

public class NumberPositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number >> ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("You entered positive number");
		} else if (num < 0) {
			System.out.println("You entered negative number");
		} else {
			System.out.println("You entered zero");
		}
	}
}
