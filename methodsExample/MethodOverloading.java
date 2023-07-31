package methodsExample;

public class MethodOverloading {
	

	void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition is " + c);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}

	public static void main(String[] args) {
       
		 MethodOverloading obj =new  MethodOverloading();
		obj.add(5,5); //calling the method
		obj.add(5,6,7);
}
}