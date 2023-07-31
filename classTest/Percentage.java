package classTest;

//question-2
import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Physics marks : ");
		int
		phy = sc.nextInt();

		System.out.print("Enter the Chemistry marks : ");
		int chem = sc.nextInt();

		System.out.print("Enter the Biology marks : ");
		int bio = sc.nextInt();

		System.out.print("Enter the Mathematics marks : ");
		int math = sc.nextInt();

		System.out.print("Enter the Computer marks : ");
		int comp = sc.nextInt();

		int totalMark = (phy + chem + bio + math + comp);
		System.out.println(totalMark);

		int percentage = (totalMark / 5);

		System.out.println(percentage);

		switch (percentage) {
		case 90:	
				System.out.println("Grade A");
			break;

		case 80:
				System.out.println("Grade B");
			break;

		case 70:
				System.out.println("Grade C");
			break;

		case 60:
				System.out.println("Grade D");
			break;

		case 40:
			System.out.println("Grade E");
			break;

		default:
			System.out.println("You are fail");
			break;
		}

	}

}
