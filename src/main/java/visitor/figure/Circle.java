package visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
    	super(description);
        this.radius = radius;
    }

	public double getRadius() {
		return radius;
	}

    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
