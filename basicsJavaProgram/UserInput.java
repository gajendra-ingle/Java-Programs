package basicsJavaProgram;

import java.util.Scanner;// Import the Scanner class

//Program for Addition of two number using User input.

public class UserInput {
	void add() {
		Scanner sc = new Scanner(System.in); // Create a Scanner object

		System.out.print("Enthe the first number : ");
		int a = sc.nextInt(); // nextInt() is used to take an integer value

		System.out.print("Enter the second number : ");
		int b = sc.nextInt();

		int c = a + b;
		System.out.print("Addition of given two number is : " + c);

	}

	public static void main(String[] args) {
		UserInput obj = new UserInput(); // created object of UserInput class
		obj.add(); // call the add() method

	}
}
