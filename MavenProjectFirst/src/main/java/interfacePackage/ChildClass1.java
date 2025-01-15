package interfacePackage;

public class ChildClass1 implements Interface_1, Interface_2, Interface_3, Interface_4 {

	public static void main(String[] args) {
		ChildClass1 obj = new ChildClass1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
		Interface_4 obj1 = new ChildClass1();
		obj1.display4();

	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Display2");

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Display1");

	}

//	@Override
//	public void display3() {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public void display4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display3() {
		// TODO Auto-generated method stub

	}

}
