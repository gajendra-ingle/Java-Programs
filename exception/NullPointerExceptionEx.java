package exception;

public class NullPointerExceptionEx {
	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.length());

		} catch (NullPointerException e) {
			System.out.println("we can't calculate the length of null variable..");
		}
		
	}

}
