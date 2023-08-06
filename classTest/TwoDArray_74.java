package classTest;

//question-4
import java.util.Scanner;

public class TwoDArray_74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the row size :");
		int rSize = sc.nextInt();

		System.out.print("Enter the column size :");
		int cSize = sc.nextInt();

		int a[][] = new int[rSize][cSize];
		System.out.println("Enter the 2D array elements :");

		for (int i = 0; i < rSize; i++) {
			for (int j = 0; j < cSize; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// print 2D array
		System.out.println("2D array elements are...");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");

			}
		}

	}

}
