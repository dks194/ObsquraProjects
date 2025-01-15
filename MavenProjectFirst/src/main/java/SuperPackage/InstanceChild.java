package SuperPackage;

public class InstanceChild extends InstanceParent {

	String childColour = "Black";

	public void display() {
		System.out.println("Child colour is:" + childColour);
		String parentColour = super.colour;
		System.out.println("Parent colour is:" + parentColour);
	}

	public static void main(String[] args) {
		InstanceChild obj = new InstanceChild();
		obj.display();

	}

}
