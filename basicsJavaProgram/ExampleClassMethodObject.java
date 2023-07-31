package basicsJavaProgram;

public class ExampleClassMethodObject { // class --> ExampleClassMethodObject

	void Print() { // print() is a method name
		System.out.println("Hello print method");
	}

	public static void main(String[] args) {
		ExampleClassMethodObject obj = new ExampleClassMethodObject();// object
		obj.Print(); // Call the void method
		
	}
}
