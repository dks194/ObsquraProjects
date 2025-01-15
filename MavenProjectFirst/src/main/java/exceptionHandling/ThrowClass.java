package exceptionHandling;

public class ThrowClass {

	public static void main(String[] args) {
		int age = 2;
		if (age > 18) {
			System.out.println("Eligible for voting");

		}
		else {
			throw new ArithmeticException("throw-not eligible for voting");
		}

	}

}
