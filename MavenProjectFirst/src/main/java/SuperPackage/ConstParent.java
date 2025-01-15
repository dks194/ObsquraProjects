package SuperPackage;

public class ConstParent {
	
	public ConstParent() {
		
	}
	
	public ConstParent(int a, int b) {
		int c = a+b;
		System.out.println("parent class sum:"+c);
	}
	
	public ConstParent(int a, int b,int c) {
		int d = a+b+c;
		System.out.println("parent class with 3 ints sum:"+d);
	}
	
	public ConstParent(String name) {
	
		System.out.println("parent 3rd const :"+ name);
	}

}
