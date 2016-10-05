package visitor.figure;

public class VisitorFigureArea extends Visitor {
	private double totalArea;
	
	public VisitorFigureArea() {
		totalArea = 0;
	}
	
	public double getTotalArea() {
		return totalArea;
	}
	
	@Override
	public void visitCircle(Circle c) {
		double radius = c.getRadius();
		totalArea += Math.PI * radius * radius;
	}

	@Override
	public void visitSquare(Square s) {
		double side = s.getSide();
		totalArea += side * side;
	}

	@Override
	public void visitTriangle(Triangle v) {
		double base = v.getBase();
		double height = v.getHeight();
		totalArea += base * height * 0.5;
	}
}
