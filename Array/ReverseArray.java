package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array :");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the array elements :");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// logic
		int temp;
		for (int i = 0; i < size / 2; i++) {

			// swapping using third variable
			/*
			 *  temp = arr[i];
			 *  arr[i] = arr[size - 1 - i];
			 *  arr[size-1-i]= temp;
			 */

			// swapping without third variable
			arr[i] = arr[i] + arr[size - 1 - i];
			arr[size - 1 - i] = arr[i] - arr[size - 1 - i];
			arr[i] = arr[i] - arr[size - 1 - i];

		}

		// Print the array
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
