package controlStatement;
//checked the number is positive or negative
import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("Positive Number");
			
		}else if (num < 0) {
			System.out.println("Negative Number");
			
		}else {
			System.out.println("Zero Number");
		}
	}

}
