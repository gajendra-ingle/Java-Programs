package classTest;

//question-3
import java.util.Scanner;

public class MultiplicationOfArrayElements_73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.print("Enter the array elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int result = 1;
		for (int i = 0; i < a.length; i++) {
			result = a[i] * result;
		}
		System.out.print("Multliplication is : " + result);
	}

}
