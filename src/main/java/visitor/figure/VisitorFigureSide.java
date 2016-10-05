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
		totalSide += c.getSidesNumber();
	}

	@Override
	public void visitSquare(Square s) {
		totalSide +=  s.getSidesNumber();
	}

	@Override
	public void visitTriangle(Triangle v) {
		totalSide += v.getSidesNumber();
	}
}
