package string;

import java.util.Scanner;

public class CountOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string :");
		String str = sc.next();

		char a[] = str.toCharArray();

		System.out.print("Enter the occurance :");
		char oc = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (oc == a[i]) {
				count++;

			}
		}
		System.out.print("Total Occurance is :"+count);

	}

}
