package Array;

import java.util.Scanner;

public class StringUserDefineArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of aaray : ");
		int size = sc.nextInt();
		
		String arr[] = new String[size];
		System.out.print("Enter the array elements : ");

		// reading array elements from the user
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
		}

		// for print the array elements.
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

}
