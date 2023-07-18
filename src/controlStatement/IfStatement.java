
package controlStatement;

import java.util.Scanner;

//check the number is divisible by 5
public class IfStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Integer number : ");
	    int num = sc.nextInt();
	    
	    if(num % 5 == 0) {
	    	System.out.println("Yes, The is divisible by 5.");
	    }
		System.out.println("Sorry, Not divisible by 5.");
	}

}
