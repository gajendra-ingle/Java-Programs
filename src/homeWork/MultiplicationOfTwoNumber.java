package homeWork;

//WAP to perform multliplication of two number
import java.util.Scanner;

public class MultiplicationOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two number >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a * b;
		System.out.println("Multiplication of two number is >> " + c);
	}

}
