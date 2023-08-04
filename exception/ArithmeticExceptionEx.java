package exception;

import java.util.Scanner;

public class ArithmeticExceptionEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the first number : ");
			int num1 = sc.nextInt();

			System.out.print("Enter the second number : ");
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.print("Division is : " + result);

		} catch (ArithmeticException e) {
			System.out.print("Can't divide a number by 0.");

		}

	}

}
