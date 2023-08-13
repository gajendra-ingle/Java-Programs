package string;

import java.util.Scanner;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string:");
		String str = sc.next();

		// character array
		char a[] = str.toCharArray();

		// logic
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = '*';

				}
			}
		}

		// print
		for (int i = 0; i < a.length; i++) {
			if (a[i] != '*') {
				System.out.print(a[i]);

			}
		}
	}

}
