package mavenPackage;

public class MavenClass {
	int num = 15;

//Constructor
	public MavenClass() {

		int a = 10;
		int b = 5;
		int c = a + b + this.num;
		System.out.println("sum : " + c);
	}

	
	public MavenClass(int a,int b) {

		int c = a + b;
		System.out.println("Parameterized constructor : " + c);
	}
	
	public MavenClass(String name) {
		System.out.println("Constructor string:"+name);
	}

//Static method
	public static void sumInt() {

		int num1 = 1;
		int num2 = 3;
		int intSum = num1 + num2;
		System.out.println("Static method :" + intSum);
	}

//Parameterized static method
	public static void paraStatic(int a, int b) {

		int intSum = a + b;
		System.out.println("Parameterised Static method :" + intSum);
	}
//instance method
	public void sum() {
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("sum : " + sum);
	}

//parameterized instance method
	public void paraInstance(int a,int b) {
		int c = a+b;
		System.out.println("Parameterized instance method :"+c);
	}
	
//return
	public int sumReturn() {
		int a =10;
		int b =12;
		//int c = a+b;
		//return c;
		return a+b;
	}
	
//Main method
	public static void main(String[] args) {
		MavenClass obj = new MavenClass();
		obj.sum();
		sumInt();
		paraStatic(5, 8);
		obj.paraInstance(78, 10);
		MavenClass obj1 = new MavenClass(15,12);
		
		MavenClass obj2 = new MavenClass("Devika");
		MavenClass returnType = new MavenClass();
		int ret = returnType.sumReturn();
		System.out.println("return type : "+ret );

	}

}
