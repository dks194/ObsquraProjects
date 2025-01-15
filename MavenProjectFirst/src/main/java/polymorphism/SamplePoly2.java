package polymorphism;

public class SamplePoly2 extends SamplePoly1 {

	public void calc(int a,int b) {
		super.calc(12, 2);
		int cSub = a-b;
		System.out.println("Sub: "+cSub);
	}
	
	public void mul(int c,int d) {
		super.mul(5, 2);
		System.out.println("Im the child class mul function");
	}
	public static void main(String[] args) {
		SamplePoly1 obj = new SamplePoly2();
		obj.calc(10, 5);
		obj.mul(14, 15);
		obj= new SamplePoly1();
		obj.calc(10, 5);
	}
}
