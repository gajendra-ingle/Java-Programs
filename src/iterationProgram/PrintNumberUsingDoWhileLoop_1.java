package iterationProgram;

//WAP to print 1 to 10 number 
import java.util.Scanner;

public class PrintNumberUsingDoWhileLoop_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
