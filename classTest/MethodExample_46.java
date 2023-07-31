package classTest;
//q-6

public class MethodExample_46 {
	// method with return type and with arguments.
	int display(int a, int b) {
		int c = a * b;
		System.out.println("Multliplication is : " + c);
		return c;
	}

	public static void main(String[] args) {
		MethodExample_46 obj = new MethodExample_46();
		obj.display(6, 4);
	}
}
