package classTest;

//question-6
import java.util.Scanner;

public class DescendingOrderArray_76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size :");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.print("Enter array elements :");

		// input array
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		// logic for descending oreder
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1 + i; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// print array
		System.out.println("Descending order is...");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
