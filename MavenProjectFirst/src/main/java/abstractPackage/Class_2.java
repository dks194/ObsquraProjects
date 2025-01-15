package abstractPackage;

public class Class_2 extends Class_1 {

	public static void main(String[] args) {
		Class_1 parent = new Class_2();
		parent.display();
		parent.test();
		

	}
	

	@Override
	public void display() {
		System.out.println("Im the overrided display method");
		
	}
	public void display_1() {
		System.out.println("Im the display_1 method");
		
	}
	public void show() {
		System.out.println("Im the show method");
		
	}

}


