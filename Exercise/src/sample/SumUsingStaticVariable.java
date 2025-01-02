package sample;

public class SumUsingStaticVariable {
	
	static int a = 5;
	static int b = 10;
	
	public static void sum() {
		int c = a+ b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		sum();
	}

}
