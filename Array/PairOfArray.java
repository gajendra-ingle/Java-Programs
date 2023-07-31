package Array;

import java.util.Scanner;

public class PairOfArray {
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
			for (int j = 0; j < size; j++) {
				System.out.println(arr[i] + "," + arr[j]);
			}
		}
	}

}
