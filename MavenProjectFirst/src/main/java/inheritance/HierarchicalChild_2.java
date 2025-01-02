package inheritance;

public class HierarchicalChild_2 extends HierarchicalParent {

public void hierChild2() {
		
		System.out.println("Im the second child");
		
	}
	public static void main(String[] args) {
		HierarchicalChild_2 child2 =new HierarchicalChild_2();
		child2.hierParent();
		child2.hierChild2();

	}

}
