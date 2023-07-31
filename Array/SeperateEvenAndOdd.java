package Array;

import java.util.Scanner;

public class SeperateEvenAndOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			
			
			
		}

		System.out.println("Even number are..");
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("Odd number are..");
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
