package abstractPackage;

public class AbstractChild extends AbstractParent {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Im the overrided DISPLAY method");

	}

	public void display_1() {
		// TODO Auto-generated method stub
		System.out.println("Im the DISPLAY 1 method in child class");

	}
//	public void show() {
//		System.out.println("Im the SHOW method in child class");
//	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Im the overrided PRINT method");
	}

}
