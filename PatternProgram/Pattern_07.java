package PatternProgram;

/*	Output :-	2
 	 			4 4 
 	 			6 6 6 
 	 			8 8 8 8
	
*/

public class Pattern_07 {
	public static void main(String[] args) {
		for (int i = 2; i <= 8; i = i + 2) {
			for (int j = 1; j <= i; j = j + 2) {
				System.out.print("  " + i);
			}
			System.out.println();
		}
	}
}
