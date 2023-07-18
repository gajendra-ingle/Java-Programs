package constructorPractice;

public class NoParameterizedConstructor {
	int i;

	// No Parameterized Constructor
	NoParameterizedConstructor() {
		i = 5;
		System.out.println("No parameterized constructor is called.");
	}

	public static void main(String[] args) {
		NoParameterizedConstructor obj = new NoParameterizedConstructor();

		System.out.println("Value of i : " + obj.i);
	}
}
