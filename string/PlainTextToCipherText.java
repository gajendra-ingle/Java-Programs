package string;

import java.util.Scanner;

public class PlainTextToCipherText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the text : ");
		String str = sc.next();

		char a[] = str.toCharArray();

		// logic
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'A' && a[i] <= 'Z') {
				a[i] = (char) ('A' + 'Z' - a[i]);

			} else {
				a[i] = (char) ('a' + 'z' - a[i]);

			}
		}

		// print
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
