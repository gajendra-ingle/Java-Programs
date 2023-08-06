package classTest;

//question-1
import java.util.Scanner;

public class CalculatorUsingSwitch_71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int first = sc.nextInt();

		System.out.print("Enter second number : ");
		int second = sc.nextInt();

		System.out.print("Enter your choice (+,-,*,/,%): ");

		char operater = sc.next().charAt(0);

		int result;

		switch (operater) {
		case '+': {
			result = first + second;
			System.out.print("Addition is : " + result);
			break;
		}
		case '-': {
			result = first - second;
			System.out.print("Substraction is : " + result);
			break;
		}
		case '*': {
			result = first * second;
			System.out.print("Multliplication is : " + result);
			break;
		}
		case '/': {
			result = first / second;
			System.out.print("Division is : " + result);
			break;
		}
		case '%': {
			result = first % second;
			System.out.print("Remainder is : " + result);
			break;
		}
		default:
			System.out.println("invalid choice..");
		}

	}

}
