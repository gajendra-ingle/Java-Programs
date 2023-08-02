package string;

public class SwapString {
	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Programming";

		System.out.println(str1 + " " + str2);

		// Swap two Strings Without Using any Third Variable
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println(str1 + " " + str2);
	}

}
