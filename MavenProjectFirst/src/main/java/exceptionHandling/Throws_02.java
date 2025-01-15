package exceptionHandling;

public class Throws_02 {
	
	public static void display() throws ArithmeticException {
		System.out.println("Static method");
		throw new ArithmeticException("throw Exception");
	}

	public static void main(String[] args) {
		try {
			display();
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception handled");
		}

	}

}
