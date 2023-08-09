package PatternProgram;

/*	Output :-	* * * * *
 		          * * *
		            *
*/ 		            
		            
		            
public class Pattern_15 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = i; k <= 5; k++) {
				if (i % 2 != 0) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
