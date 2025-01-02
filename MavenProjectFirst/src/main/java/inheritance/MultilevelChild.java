package inheritance;

public class MultilevelChild extends MultilevelIntermidiate {
	
	public void displayMultiChild() {
		System.out.println("I'm the child class");	}

	public static void main(String[] args) {
	
		MultilevelChild obj = new MultilevelChild();
		obj.displayMultiChild();
		obj.displayMultiIntermediate();
		obj.displayMultiParent();

	}

}
