package patternUsingDoWhileLoop;

public class Pattern_01 {

	public static void main(String args[]) {
		int i = 1;
		do {
			int j = 1;
			while (j <= 4) { // For Row
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;

		} while (i <= 3
				); //For Column
	}
}
