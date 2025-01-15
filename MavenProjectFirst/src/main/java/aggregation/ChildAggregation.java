package aggregation;

public class ChildAggregation {
	int rollNo;
	String subject;
	ParentAgrregation reference;//reference variable

	public ChildAggregation(int rollNo, String subject, ParentAgrregation reference) {
		this.rollNo = rollNo;
		this.subject = subject;
		this.reference = reference;
	}

	public void display() {
		System.out.println("Child clss display method : " + subject + "\n" + "Roll number is: " + rollNo);
		System.out.println("Name is "+ reference.name+"\n"+"Age is "+reference.age);
	}

	public static void main(String[] args) {
		ParentAgrregation parent = new ParentAgrregation(31, "Devika");
		ChildAggregation child = new ChildAggregation(7, "Maths",parent);
		child.display();
		
	}

}
