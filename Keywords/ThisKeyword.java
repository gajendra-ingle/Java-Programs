package Keywords;

public class ThisKeyword {

	
	void print() {
		System.out.println("hello");
	}

	void print_1() {
		this.print();
		System.out.println("Java");
	}

	void print_2() {
		this.print_1();
		System.out.println("Programming");
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();

		obj.print_2();
	}
}
