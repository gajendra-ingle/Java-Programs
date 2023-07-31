package Array;

import java.util.Scanner;

public class ReplaceZerosToOnes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// logic
		for (int i = 0; i < size; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
