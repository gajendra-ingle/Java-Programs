package homeWork;

//WAP to check whether a year is leap year or not
import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year >> ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " Leap year");
		} else {
			System.out.println(year + " Non leep year");
		}
	}

}
