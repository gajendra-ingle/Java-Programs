package patternUsingDoWhileLoop;
/*	Output :-	***
				**
 				*			
*/ 
public class Pattern_03 {
	public static void main(String[] args) {

		int i = 1;
		do {
			int j = i;
			while (j <= 3) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		} while (i <= 3);

	}
}
