package basicsJavaProgram;

public class Addition { // class --> Addition
	void Add() { // Add() is a method name
		int a = 6;
		int b = 10;
		int result = a + b;
		System.out.println("The addition of two number is : " + result);
	}

	public static void main(String[] args) {
		Addition obj = new Addition(); // Created an object of Addition class
		obj.Add(); // Call the void method

	}

}

