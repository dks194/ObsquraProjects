package SuperPackage;

public class ConstChild extends ConstParent {

	public ConstChild() {
		super(25,3);
		System.out.println("Im the child class");
		
	}
	
	public ConstChild(int a,int b) {
		super(12,3,58);
		int c = a+b;
		
		System.out.println("Child sum:"+c);
	}

	public ConstChild(String name) {
		super("Devika");
		System.out.println("child 3rd const :"+ name);
	}
	
	public ConstChild(int a,int b, int c) {
		this("Shyam");
	}
	
	/*public ConstChild(float a,float b) {
		System.out.println("child float"+a+b);
	}*/
	
	public static void main(String[] args) {
		ConstChild obj = new ConstChild();
		ConstChild obj1 = new ConstChild(25,10);
		ConstChild obj2 = new ConstChild("Devika");
		ConstChild obj3 = new ConstChild(20,30,25);
		ConstChild obj4 = new ConstChild(54, 4);
		
	}

}
