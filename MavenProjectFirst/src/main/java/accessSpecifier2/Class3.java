package accessSpecifier2;

import accessSpecifier.Class1;

public class Class3 extends Class1 {

	public static void main(String[] args) {
		Class3 obj3 = new Class3();
		obj3.protectedMethod();
		obj3.publicMethod();
		//obj3.privateMethod();can only access within the class
		//obj3.defaultMethod(); can only access within the package

	}

}
