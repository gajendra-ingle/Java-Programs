package patternUsingDoWhileLoop;

public class Pattern_02 {
	public static void main(String[] args) {

		int i = 1;
		do {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		} while (i <= 3);

	}

}
