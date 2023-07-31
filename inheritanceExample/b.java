package inheritanceExample;

public class b extends a {
		void mul() {
	     c=a*b;
		 System.out.println(c);
		}
		public static void main(String[] args) {
			b obj = new b();
			obj.mul();
			obj.add();
			
		}

}
