package PatternProgram;

/*	Output :-	        1
 				1 3
 				1 3 5 
 				1 3 5 7 
*/ 

public class Pattern_09 {
	public static void main(String[] args) {
		
		for(int i=1; i<=7;i=i+2) {
			for (int j=1;j<=i;j=j+2) {
				System.out.print("  "+j);
			}
			System.out.println();
		}
	}
}
