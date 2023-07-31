package iterationProgram;

//WAP to print table using do while loop
import java.util.Scanner;

public class PrintTableUsingDoWhileLoop_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number >> ");
		int num = sc.nextInt();

		int i = 1;
		do {
			System.out.println(i + " * " + num + " = " + i * num);
			i++;
		} while (i <= 10);

	}
}
