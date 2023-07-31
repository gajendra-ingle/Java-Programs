package Array;

import java.util.Scanner;

public class FindAverageValueOFArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
        
		int avg =sum /size ;
		System.out.print("Average of array is : "+avg);
	}

}
