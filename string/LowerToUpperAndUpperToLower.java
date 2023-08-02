package string;

import java.util.Scanner;

public class LowerToUpperAndUpperToLower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string :");
		String str = sc.next();

		char a[] = str.toCharArray(); // char array

		// logic
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'A' && a[i] <= 'Z') {
				a[i] = (char) (a[i] + 32);
			} else {
				a[i] = (char) (a[i] - 32);
			}
		}

		// print
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
