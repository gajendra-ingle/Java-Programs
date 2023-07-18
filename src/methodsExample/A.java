package methodsExample;

public class A extends MethodOverrding {
	void add(int a, int b) {
		int result = a - b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		//A obj = new A();
		MethodOverrding obj =new MethodOverrding();
		obj.add(10, 7);
	}
}
