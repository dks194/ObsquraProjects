package accessSpecifier;

public class Class1 {
	
	private void privateMethod() {
		System.out.println("Im a private method");
	}
	
	public void publicMethod() {
		System.out.println("Im a public method");
	}

	protected void protectedMethod() {
		System.out.println("Im a protected method");
	}
//default access specifier
	void defaultMethod() {
		System.out.println("Im a default method");
	}


	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.privateMethod();
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();

	}

}
