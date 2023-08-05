package classTest;

//question-4
import java.util.Scanner;

public class DoubleArray_74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size : ");
		int size = sc.nextInt();

		double a[] = new double[size];
		System.out.print("Enter the double array elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}

		// print array
		System.out.println("Array elements are :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}