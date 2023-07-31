package classTest;

public class FibSeries_51 {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int num;
		int size = 8;
		System.out.print(num1 + " " + num2);

		for (int i = 2; i <size; ++i) {
			num = num1 + num2;
			System.out.print(" " + num);
			num1 = num2;
			num2 = num;
		}
	}

}
