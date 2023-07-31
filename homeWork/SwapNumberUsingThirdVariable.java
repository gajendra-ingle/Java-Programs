package homeWork;

//WAP to swap two numbers with using third variable
import java.util.Scanner;

public class SwapNumberUsingThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a and b >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		

		System.out.println("Before swaping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("______________________________________________");

		System.out.println("After swaping");
		int c = a;
		a = b;
		b = c;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
