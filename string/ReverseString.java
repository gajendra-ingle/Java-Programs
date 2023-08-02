package string;

public class ReverseString {
	public static void main(String[] args) {

		// using StringBuffer
		StringBuffer sb = new StringBuffer("HELLO");
		System.out.println(sb.reverse());

		// using StringBuilder
		StringBuilder Sb = new StringBuilder("JAVA");
		System.out.println(Sb.reverse());

		// without using method
		String originalString = "Gajendra";
		String reverseString = " ";

		for (int i = 0; i < originalString.length(); i++) {
			reverseString = originalString.charAt(i) + reverseString;
		}
		System.out.println(reverseString);
	}

}
