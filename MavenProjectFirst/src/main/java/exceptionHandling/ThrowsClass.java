package exceptionHandling;

public class ThrowsClass {

	public void display() throws ArithmeticException  {
		System.out.println("Exception Throws");
	}
	public static void main(String[] args) {
		ThrowsClass obj = new ThrowsClass();
		obj.display();
		int age = 2;
		if (age > 18) {
			System.out.println("Eligible for voting");

		} 
		else {
			throw new ArithmeticException("throw-not eligible for voting");
		}

	}

}
                                                                