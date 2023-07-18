package classTest;

//question-3
import java.util.Scanner;

public class SwapNumber_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A >> ");
		int a = sc.nextInt();

		System.out.print("Enter B >> ");
		int b = sc.nextInt();

		System.out.println("Before Swapping >> ");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("___________________________________________");
		// Logic
		int c;
		c = a;
		a = b;
		b = c;

		System.out.println("After Swapping >> ");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
