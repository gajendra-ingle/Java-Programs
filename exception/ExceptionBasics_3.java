package exception;

public class ExceptionBasics_3 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(1);

			try {
				int a = 8 / 0;
			} catch (Exception e) {
				System.out.println("In catch");
			}

		}
	}

}
