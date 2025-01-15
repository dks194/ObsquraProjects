package accessSpecifier;

public class Class2 extends Class1 {

	public static void main(String[] args) {
		Class2 obj2 = new Class2();
		obj2.publicMethod();
		obj2.defaultMethod();
		obj2.protectedMethod();
		//obj2.privateMethod(); cannot call a private method.can only call within the method

	}

}
