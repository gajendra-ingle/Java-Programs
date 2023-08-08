package PatternProgram;

/*	Output :-	        1
 				3 3 3
 				5 5 5 5 5
 				7 7 7 7 7 7 7 
*/ 

public class Pattern_10 {
	public static void main(String[] args) {
		
		for(int i=1; i<=7;i++) {
			
			for (int j=1;j<=i;j++) {
				if (i% 2 != 0) {
					System.out.print("  "+i);
				}
				
			}
			
			System.out.println();
		}
	}

}
