package PatternProgram;

/*	Output :-		A
 					C C
 					E E E
 					G G G G
*/

public class Pattern_08 {
	public static void main(String[] args) {

		for (int i = 1; i <= 7; i = i + 2) {
			for (int j = 1; j <= i; j = j + 2) {
				System.out.print("  " + (char) (i + 64));
			}
			System.out.println();
		}
	}

}
