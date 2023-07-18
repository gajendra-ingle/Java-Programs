package PatternProgram;

public class Pattern_03 {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(" "+(char)(i+64));
			}
			System.out.println();
		}
	}
}
