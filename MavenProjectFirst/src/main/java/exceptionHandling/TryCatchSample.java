package exceptionHandling;

public class TryCatchSample {

	public static void main(String[] args) {
		int a = 10;
		try {
			
			int div = a / 0;
			System.out.println(div);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			//int div = a/2;
			//System.out.println(div);
			System.out.println("Exception Handled");
		}

		finally {
			System.out.println("Exception Handled using Finally");
		}
	}

	
}
