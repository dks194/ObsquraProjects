package aggregation;

public class Class_02 {
	String city;
	int code;
	Class_01 c;

	public Class_02(String city, Class_01 c) {
		this.city= city;
		this.c=c;
		System.out.println(city+"\n"+c.name);
		System.out.println("Class_01"+" "+c.name+" "+c.a+" "+c.b+" "+c.age);
		
	}
	public void show() {
		
		System.out.println("show:"+this.c.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_01 p = new Class_01("Devika", 31);
		p.sum(10, 12);
		Class_02 ch = new Class_02("India", p);
		ch.show();

	}

}
