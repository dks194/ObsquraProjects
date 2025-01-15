package aggregation;

public class Class_01 {
	String name;
	int age;
	int a;
	int b;

	public Class_01(String name, int age) {
		
		this.name=name;
		this.age= age;
		System.out.println("Name: "+name+"age: "+age);
	}
	

	public void sum(int a,int b) {
		this.a=a;
		this.b=b;
		int c = a+b;
		System.out.println("Sum: "+c);
	}
	
	
}
