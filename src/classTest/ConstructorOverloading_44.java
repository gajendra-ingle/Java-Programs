package classTest;
//q-4

public class ConstructorOverloading_44 {
	// Non-Parameterized Constructor
	ConstructorOverloading_44() {
		int a = 5;
		int b = 9;
		int c = a + b;
		System.out.println("Addition is : " + c);
	}

	// Parameterized Constructor
	ConstructorOverloading_44(int a, int b) {
		int sum = a - b;
		System.out.println("Substraction is : " + sum);
	}

	public static void main(String[] args) {
		ConstructorOverloading_44 obj = new ConstructorOverloading_44();
		ConstructorOverloading_44 obj1 = new ConstructorOverloading_44(8, 6);

	}
}
