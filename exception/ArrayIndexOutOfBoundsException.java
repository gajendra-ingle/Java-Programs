package exception;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {

		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (Exception e) {
			System.out.println(" Array IndexOut Of Bound...");
		}
	}
}
