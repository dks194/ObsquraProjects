package exceptionHandling;

public class TryCathchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] array = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= 9; i++) {
				System.out.println(array[i]);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
		
		}
		
	}

}
