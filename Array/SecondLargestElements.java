package Array;

import java.util.Scanner;

public class SecondLargestElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) { 
			for (int j = 1 + i; j < size; j++) {
				if (arr[i] > arr[j]) {

					// swapping
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];

				}
			}
		}
		System.out.print("Second largest elements is : " + arr[size - 2]);
		// 
	}

}
