package Array;

import java.util.Scanner;

public class CountEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		// Declaration of array.
		int arr[] = new int[size];
		System.out.print("Enter the aaray elements : ");

		// reading array elements from the user
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// for print the array elements.
		int countEven = 0;
		for (int i = 0; i < size; i++) {
			//Check even no. condition.
			if (arr[i] % 2 == 0) {
				countEven++;
			}
		}
		System.out.println("Total even no is : " + countEven);
	}

}
