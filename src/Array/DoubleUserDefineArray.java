package Array;

import java.util.Scanner;

public class DoubleUserDefineArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array :");
		int size = sc.nextInt();

		// Declaration of array.
		double arr[] = new double[size];
		System.out.print("Enter the array elements : ");

		// reading array elements from the user
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextDouble();
		}

		// for print the array elements.
		for (int i = 0; i < size; i++) {
			System.out.println(" " + arr[i]);
		}
	}

}
