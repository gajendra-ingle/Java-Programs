package Array;

import java.util.Scanner;

public class ElementPresentInArrayOrNot {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the search elements :");
		int num = sc.nextInt();
		
		//logic
		boolean value = false;
		for (int i = 0; i < size; i++) {
			if (num == arr[i]) {
				value = true;
			}
		}
		
		if (value == true) {
			System.out.print("Elements contains..");
			
		} else {
			System.out.print("Elements not contains..");
		}
	}

}


