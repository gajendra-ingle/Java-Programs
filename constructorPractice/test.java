package constructorPractice;

//Example of constructor
public class test {

	test() { //constructor
		int a = 5, b = 4, c;
		c = a + b;
		System.out.println("Result is : " + c);
	}

	public static void main(String[] args) {
		test obj = new test(); //calling a constructor
	}
}
