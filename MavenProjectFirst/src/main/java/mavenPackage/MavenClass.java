package mavenPackage;

public class MavenClass {
	int num = 15;
	
	public MavenClass() {
		
		int a =10;
		int b = 5;
		int c = a+b+this.num;
		System.out.println("sum : "+c);
	}
	
	public void sum() {
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("sum : "+sum);
	}

	public static void main(String[] args) {
		MavenClass obj = new MavenClass();
		obj.sum();
		

	}

}
