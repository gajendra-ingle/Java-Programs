//WAP to calculate area of an equilateral triangle. 

package homeWork;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side of Equilateral Triangle : ");
		double side = sc.nextDouble();

		double area = (1.73 * side * side) / 4; // value of √(3) = 1.73
		System.out.println("Area of Equilateral Triangle is :" + area);
	}
}
