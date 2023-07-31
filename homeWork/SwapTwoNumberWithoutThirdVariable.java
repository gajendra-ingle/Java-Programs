package homeWork;

//WAP to swap two number without using third variable
import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number and second number >> ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		System.out.println("Before swap first number >> "+no1);
		System.out.println("Before swap second number >>"+no2);
		
		no1 = no1 + no2; //x=x+y;
		no2 = no1 - no2; //y=x-y;
		no1 = no1 - no2; //x=x-y;
		
		System.out.println("After swap first number >> "+ no1 );	
		System.out.println("After swap second number >> "+no2);
		
	}
}
