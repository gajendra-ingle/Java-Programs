//WAP to calculate area of circle.

package homeWork;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double PI = 3.142, area;

		System.out.print("Enter the radius of circle : ");
		int radius = sc.nextInt();

		area = PI * radius * radius; // calculating the area of the circle
		System.out.println("Area of circle is :" + area); // printing the area of the circle
	}

}
