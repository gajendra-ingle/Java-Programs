package patternUsingDoWhileLoop;

public class Pattern_04 {
	public static void main(String[] args) {

		int i = 1;
		do {
			int j = 1;
			while (j <= i) {
				System.out.print("  " + (char) (i + 64));
				j++;
			}
			System.out.println();
			i++;
		} while (i <= 3);
	}

}
