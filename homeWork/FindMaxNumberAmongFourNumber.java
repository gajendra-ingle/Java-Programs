package homeWork;

//WAP to find maximum/greater among four number.
import java.util.Scanner;

public class FindMaxNumberAmongFourNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter four number >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a >= b && a >= c && a >= d) {
			System.out.println(a + " is greater");

		} else if (b >= a && b >= c && b >= d) {
			System.out.println(b + " is greater");

		} else if (c >= a && c >= b && c >= d) {
			System.out.println(c + " is greater");
		} else {
			System.out.println(d + " is greater");
		}

	}
}
