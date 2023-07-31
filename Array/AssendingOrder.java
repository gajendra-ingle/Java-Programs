package Array;

import java.util.Iterator;
import java.util.Scanner;

public class AssendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array :");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Logic
		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) {

					// swaping
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		// Print the array
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}






