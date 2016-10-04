package visitor.element;

public class Visitor2 extends Visitor {
	private int elementAVisited;
	private int elementBVisited;

	public void visitor2() {
		elementAVisited = 0;
		elementBVisited = 0;
	}
	
	@Override
	public void visitElementA(ElementA e) {
		elementAVisited += 1;
	}

	@Override
	public void visitElementB(ElementB e) {
		elementBVisited += 1;
	}
	
	public int getAs() {
		return elementAVisited;
	}

	public int getBs() {
		return elementBVisited;
	}
}
