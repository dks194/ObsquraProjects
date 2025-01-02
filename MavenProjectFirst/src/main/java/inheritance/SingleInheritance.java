package inheritance;

public class SingleInheritance extends SingleInheritanceParent {
	
	public void childDisplay() {
		System.out.println("I'm the child class");
		
	}

	public static void main(String[] args) {
		SingleInheritance single = new SingleInheritance();
		single.childDisplay();
		single.display();

	}

}
