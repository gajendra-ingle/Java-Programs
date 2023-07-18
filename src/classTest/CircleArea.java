package classTest;
//question-3
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double PI = 3.142, area;

		System.out.print("Enter the radius of circle : ");
		int radius = sc.nextInt();

		area = PI * radius * radius; 
		System.out.println("Area of circle is :" + area); 
	}

}
