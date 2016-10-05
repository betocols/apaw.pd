package visitor.figure;

public class VisitorFigureSide extends Visitor {
	private double totalSide;
	
	public VisitorFigureSide() {
		totalSide = 0.0;
	}
	
	public double getTotalSide() {
		return totalSide;
	}
	
	@Override
	public void visitCircle(Circle c) {
		totalSide =+ Double.POSITIVE_INFINITY;
	}

	@Override
	public void visitSquare(Square s) {
		totalSide += + 4;
	}

	@Override
	public void visitTriangle(Triangle v) {
		totalSide += 3;
	}
}
