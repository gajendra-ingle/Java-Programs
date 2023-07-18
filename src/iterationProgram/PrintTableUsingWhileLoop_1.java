package iterationProgram;

// WAP to print table using while loop
import java.util.Scanner;

public class PrintTableUsingWhileLoop_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number >> ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(num * i);
			i++;
		}
	}

}
