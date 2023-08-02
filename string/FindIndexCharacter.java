package string;

import java.util.Scanner;

public class FindIndexCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string :");
		String str = sc.next();

		char a[] = str.toCharArray(); // char aaray

		System.out.print("Enter the string :");
		int index = sc.nextInt();

		// logic
		for (int i = 0; i < a.length; i++) {
			if (i == index) {
				System.out.print(a[i]);
			}
		}
	}

}
