package exception;

public class ExceptionBasics_4 {
	public static void main(String[] args) {

		System.out.println(1);
		try {
			try {
				System.out.println(11);
				int a = 8 / 0;
				System.out.println(2);

			} catch (Exception e) {
				System.out.println("In first catch");
				try {
					int b = 6 / 0;
				} catch (NullPointerException e1) {
					System.out.println("In second catch");
				}
				System.out.println(222);
				System.out.println(4);
			}
			System.out.println(5);

		} catch (Exception e) {
			System.out.println("In third catch");
		}
		System.out.println(8);
	}

}
