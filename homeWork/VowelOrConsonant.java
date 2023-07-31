package homeWork;
//WAP to input any alpahbet and check whether it is vowel or consonant

import java.util.Scanner;
public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any alphabet >> ");
		char ch = sc.next().charAt(0);      
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel.");
		}else {
			System.out.println(ch + " is consonant.");
		}
		
	}

}






