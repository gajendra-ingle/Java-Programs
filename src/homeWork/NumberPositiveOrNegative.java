package homeWork;

//WAP to check whether a number is positive or negative
import java.util.Scanner;

public class NumberPositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number >> ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Positive number");
		} else if(num < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("Zero");
		}
	}
}
