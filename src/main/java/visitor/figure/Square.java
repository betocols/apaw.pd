package visitor.figure;

public class Square extends Figure {
    private double side;
    private static double SIDES_NUMBER = 4;
    
    public Square(String description, double side) {
    	super(description);
        this.side = side;
        this.sidesNumber = SIDES_NUMBER;
    }
    
	public double getSide() {
		return side;
	}
	
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void accept(Visitor v) {
    	v.visitSquare(this);
    }
}
