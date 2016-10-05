package visitor.figure;

public class Triangle extends Figure {
    private double base;
    private double height;
    private static double SIDES_NUMBER = 3; 
    		
    public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
        this.sidesNumber = SIDES_NUMBER;
    }

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void accept(Visitor v) {
    	v.visitTriangle(this);
    }

}
