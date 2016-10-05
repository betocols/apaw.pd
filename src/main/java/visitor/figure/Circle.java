package visitor.figure;

public class Circle extends Figure {

    private double radius;
    private static double SIDES_NUMBER = Double.POSITIVE_INFINITY;

    public Circle(String description, double radius) {
    	super(description);
        this.radius = radius;
        this.sidesNumber = SIDES_NUMBER;
    }

	public double getRadius() {
		return radius;
	}
	
    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
