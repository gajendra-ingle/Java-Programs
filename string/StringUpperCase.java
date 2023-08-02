package string;

import java.util.Scanner;

public class StringUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any string which is to be converted to uppercase :");
		String str = sc.next();

		// character array
		char a[] = str.toCharArray();

		for (int i = 0; i < a.length; i++) {
			// condition
			if (a[i] >= 'a' && a[i] <= 'z') {
				a[i] = (char) (a[i] - 32); // type casting

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
