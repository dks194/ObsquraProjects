package polymorphism;

public class SamplePoly1 {
	
	public void calc(int a,int b) {
		int c = a+b;
		System.out.println("Sum: "+c);
	}
	
	public void mul(int c,int d) {
		int calc = c*d;
		System.out.println(" Im the parent class mul function Mul: "+calc);
	}

}
