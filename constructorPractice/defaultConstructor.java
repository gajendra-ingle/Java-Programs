package constructorPractice;

public class defaultConstructor {
	
	int a;
	boolean b;
	
	public static void main(String[] args) {
		//A default constructor is called 
		defaultConstructor obj = new defaultConstructor();
		
		System.out.println("default value : ");
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		
	}
}
