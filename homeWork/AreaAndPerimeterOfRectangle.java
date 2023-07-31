//WAP to print the area and perimeter of a rectangle

package homeWork;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
	public static void amin(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length;
		int breadth;
		System.out.print("Enter the Length & Breadth of Rectangle :");
		length = sc.nextInt();
		breadth = sc.nextInt();

		int area = length * breadth; // calculate the area of Rectangle
		System.out.println("Area of Rectangle is : " + area);

		int perimeter = 2 * (length + breadth); // calculate the Perimeter of Rectangle
		System.out.println("Perimeter of rectangle:" + perimeter);

	}

}
