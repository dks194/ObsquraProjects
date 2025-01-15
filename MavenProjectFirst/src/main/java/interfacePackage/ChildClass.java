package interfacePackage;

public class ChildClass implements InterfaceParent{

	public static void main(String[] args) {
		InterfaceParent parent = new ChildClass();
		parent.sum();
		System.out.println("parent variable: "+a);
		calculator(new ChildClass());

	}
	
	public static void calculator(InterfaceParent p) {
		p.sum();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("parent variable: "+a);
	}

}
