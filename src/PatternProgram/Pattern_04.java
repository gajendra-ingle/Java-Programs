package PatternProgram;

public class Pattern_04 {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("   ");
			}
			for (int k = i; k <= 3; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
