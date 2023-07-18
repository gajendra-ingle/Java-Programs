package homeWork;

//WAP to input any character and check whether its is alphabet, digit or special character.
import java.util.Scanner;

public class CheckAlphabetDigitSpecialCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice >> ");
		char choice = sc.next().charAt(0);

		if (choice >= 'A' && choice <= 'Z' || choice >= 'a' && choice <= 'z') {
			System.out.println("You entered alphabet");
			
		}else if (choice >=  47 && choice <= 58) {
			System.out.println("You entered number");
			
		}else {
			System.out.println("you entered special symbol");
		}

	}

}
