package classTest;

import java.util.Scanner;

//question-4
public class InputMistmatchException {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter a Integer Value: ");
		int a = obj.nextInt();
      
		System.out.println(a);
	}

}
