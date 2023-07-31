package Array;

import java.util.Scanner;

public class TotalOfArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		// Array declaration.
		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");

		// for input array
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// for print array
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];

		}
		System.out.print("Total of array elements is : " + sum);
	}

}
