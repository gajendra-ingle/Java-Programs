package classTest;

//question-1
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of A >> ");
		int a = sc.nextInt();

		System.out.print("Enter the value of B >> ");
		int b = sc.nextInt();

		System.out.println("Press 1 >> Addition");
		System.out.println("Press 2 >> Substraction");
		System.out.println("Press 3 >> Multiplication");
		System.out.println("Press 4 >> Division");

		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			System.out.print(a + b);
			break;
		}
		case 2: {
			System.out.println(a-b);
			break;
		}
		case 3: {
			System.out.println(a*b);
			break;
		}
		case 4: {
			System.out.println(a/b);
			break;
		}
		default:
			System.out.println("Invalid choice");
		}
	}
}
