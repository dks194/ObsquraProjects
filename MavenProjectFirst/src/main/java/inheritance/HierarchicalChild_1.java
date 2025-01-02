package inheritance;

public class HierarchicalChild_1 extends HierarchicalParent {
	


	public void hierChild1() {
		
		System.out.println("Im the first child");
		
	}
	public static void main(String[] args) {
		HierarchicalChild_1 child1 =new HierarchicalChild_1();
		child1.hierChild1();
		child1.hierParent();

	}

}
