package aggregation;

public class Child {
	String name;
	Parent ref;

	public Child(String name, Parent ref) {
		this.name = name;
		this.ref = ref;
	}
	public void display() {
		System.out.println("Child class display method : " + name );
		System.out.println("City name is "+ ref.cityName+"\n"+"City code is "+ref.cityCode);
	}

	public static void main(String[] args) {
		Parent parentref = new Parent("India",007);
		Child childref = new Child("Devika",parentref);
		childref.display();

	}

}
