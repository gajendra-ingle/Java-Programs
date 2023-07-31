package classTest;

//question-2
import java.util.Scanner;

public class DataType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Integer Value: ");
		int a = sc.nextInt();

		System.out.print("Enter a Character Value: ");
		char b = sc.next().charAt(0);
 
	
		System.out.println("Enter a String Value: ");
		String c = sc.nextLine();

		System.out.print("Enter a Double Value: ");
		double d = sc.nextDouble();
		
        System.out.println();
		System.out.println("You Enter the Value of Integer is: " + a);
		System.out.println("You Enter the Value of Character is: " + b);
		System.out.println("You Enter the Value of String is: " + c);
		System.out.println("You Enter the Value of Double is: " + d);

	}

}
