package constructorPractice;

public class ParameterizedConstructor {

	int x;

	// Parameterized Constructor
	ParameterizedConstructor(int y) {
		x = y;

	}

	public static void main(String[] args) {
       
		ParameterizedConstructor obj = new ParameterizedConstructor(5);
		System.out.println(obj.x);
	}
}
