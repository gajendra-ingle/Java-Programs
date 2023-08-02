package string;

import java.util.Scanner;

public class CalculateLengthOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ENter the string : ");
		String str = sc.next();

		char a[] = str.toCharArray();

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count++;
		}
		System.out.print("Length of string is :" + count);

	}
}
