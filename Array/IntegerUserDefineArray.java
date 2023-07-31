package Array;

import java.util.Scanner;

public class IntegerUserDefineArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		// Declaration of array.
		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");

		// reading array elements from the user
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// for print the array elements.
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
