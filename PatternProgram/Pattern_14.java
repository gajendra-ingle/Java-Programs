package PatternProgram;

/*	Output :-	        * 
  				* * 
  				* * *
  				* *
  				* 
*/
public class Pattern_14 {
	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		for (int k = 1; k <= 3; k++) {
			for (int l = k; l <= 3; l++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}


