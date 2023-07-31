package methodsExample;

public class TypesOfMethod {

	// 1.method with no return type with no arguments.
	void print() {
		System.out.println("Hello Java");
	}

	// 2.method with no return type with arguments.
	void print_1(int a, int b) {
		int c;
		c = a + b;
		System.out.println("Addition is : " + c);
	}

	// 3.method with return type with arguments.
	int print_2(int a, int b) {
		int c;
		c = a - b;
		System.out.println("Substraction is : " + c);
		return c;
	}

	// 4.method with return type with no arguments.
	int print_3() {
		int a = 10;
		int b = 4;
		int c;
		c = a * b;
		System.out.println("Multiplication is : " + c);

		return c;
	}

	public static void main(String[] args) {
		TypesOfMethod obj = new TypesOfMethod();

		obj.print(); // Hello Java
		obj.print_1(2, 6); // Addition
		obj.print_2(5, 2); // Substraction
		obj.print_3(); // Multiplication
	}
}
