package exception;

// A Class that represents user defined exception
class MyException extends Exception {
	// Parameterized constructor
	MyException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

// A Class that uses above MyException
public class UserDefineException {

	public static void main(String args[]) {
		System.out.println("Example of User Define Exception....");
		try {
			// Throw an object of user defined exception
			throw new MyException("Exception");

		} catch (MyException ex) {
			System.out.println("Caught");

			
		}
	}
}
