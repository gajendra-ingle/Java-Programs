package classTest;

//question-4
import java.util.Scanner;

public class SwapNumberWIthoutThirdVariable_24 {
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
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping >> ");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
}
