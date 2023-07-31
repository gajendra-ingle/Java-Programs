package classTest;

import java.util.Scanner;

public class VowelOrConsonant_52 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter one character :");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("it's an vowel..");
		} else {
			System.out.println("it's anconsonent..");
		}
	}

}
