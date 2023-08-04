package exception;

public class ExceptionBasics_2 {
	public static void main(String[] args) {

		System.out.println(1);

		try {
			System.out.println(11);
			int c = 6 / 0;
			System.out.println(2);

		} catch (Exception e) {
			System.out.println(3);
			try {
				int c = 6 / 0;

			} catch (Exception e1) {
				System.out.println("In catch 11");
			}
			System.out.println("In catch 22");
			System.out.println("4");
		}
		System.out.println("5");
	}
}
