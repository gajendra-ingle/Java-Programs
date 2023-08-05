package classTest;

//question-5
import java.util.Scanner;

public class AssendingOrderArray_75 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size : ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.print("Enter the array elements :");

		// input array
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		// logic for assending order
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1 + i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// print array
		System.out.println("Assending order...");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
