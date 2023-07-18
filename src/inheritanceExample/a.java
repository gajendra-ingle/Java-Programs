package inheritanceExample;

public class a {
	int a=10;
	int b=20;
	int c;
	
	void add() {
	c =a+b;
		System.out.println("Add " +c);
	}
	
	void sub() {
	  c=a-b;	
	  System.out.println("sub "+c);
	}
	
	
	public static void main(String[] args) {
	a obj =new a();
		//obj.add();
		//obj.sub();
	}
}
