package homeWork;

import java.util.Scanner;

//WAP to check whether a number is even or odd
public class NumEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number >> ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		
	}

}
 