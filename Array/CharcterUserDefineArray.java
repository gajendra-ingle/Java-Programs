package Array;

import java.util.Scanner;

public class CharcterUserDefineArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		// Declaration of array.
		char arr[] = new char[size];
		System.out.print("Enter the array character : ");

		// reading array elements from the user
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next().charAt(0); 
		}

		// for print the array elements.
		for (int i = 0; i < size; i++) {
			System.out.print(" "+arr[i]);
		}
	
	}

}
