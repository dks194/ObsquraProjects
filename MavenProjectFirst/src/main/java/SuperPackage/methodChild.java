package SuperPackage;

public class methodChild extends methodParent{
	public void childDisplay() {
		System.out.println("Im the child class");
		super.display();//display parent class object
		this.childDisplayNew();//display current class object
		//super.displayNew();
	}
	public void childDisplayNew() {
		
		
		super.displayNew();
	}

	public static void main(String[] args) {
		methodChild obj = new methodChild();
		obj.childDisplay();
		//methodChild obj1 = new methodChild();
		//obj.childDisplayNew();current class object can be called using this
	}

}
