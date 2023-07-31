package homeWork;

//WAP to input marks of five subject and calculate percentage and grade according to percentage.
import java.util.Scanner;

public class CalculatePercentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Physic marks >> ");
		int physic = sc.nextInt();

		System.out.print("Enter Chemistry marks >> ");
		int chemistry = sc.nextInt();

		System.out.print("Enter Biology marks >> ");
		int biology = sc.nextInt();

		System.out.print("Enter Mathematics marks >> ");
		int math = sc.nextInt();

		System.out.print("Enter Computer mark >> ");
		int computer = sc.nextInt();

		int totalMarks = (physic + chemistry + biology + math + computer);
		double percentage = (totalMarks / 5); // 500) * 100;

		System.out.println(percentage);

		if (percentage >= 90) {
			System.out.println("Grade A");

		} else if (percentage >= 80) {
			System.out.println("Grade B");

		} else if (percentage >= 70) {
			System.out.println("Grade C");

		} else if (percentage >= 60) {
			System.out.println("Grade D");

		} else if (percentage >= 40) {
			System.out.println("Grade E");

		} else {
			System.out.println("Grade F");
		}

	}
}
