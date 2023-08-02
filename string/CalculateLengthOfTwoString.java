package string;

import java.util.Scanner;

public class CalculateLengthOfTwoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string : ");
		String str = sc.nextLine();

		char a[] = str.toCharArray();

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ') {
				count++;
			}
		}

		System.out.print("Length of string is :" + count);

	}
}
