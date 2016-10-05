package visitor.figure;

public abstract class Visitor {
	public abstract void visitCircle(Circle c);
	
	public abstract void visitSquare(Square s);
	
	public abstract void visitTriangle(Triangle v);
}
