package methodsExample;

public class MethodOverrding {

	void add(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		MethodOverrding obj = new MethodOverrding();
		obj.add(5, 5); // calling the method

	}
}
