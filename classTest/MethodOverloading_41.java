package classTest;
//q-1

public class MethodOverloading_41 {

	void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two number is : " + c);
	}

	void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Addition of three number is : " + sum);
	}

	public static void main(String[] args) {

		MethodOverloading_41 obj = new MethodOverloading_41();

		obj.add(2, 6);
		obj.add(4, 8, 2);
	}
}
