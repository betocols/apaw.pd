package visitor.figure;

public abstract class Figure {

	protected String description;
	protected double sidesNumber;
	
    public Figure(String description) {
    	this.description = description;
    }
    
    public double getSidesNumber() {
    	return sidesNumber;
    }
    
    public abstract void accept(Visitor v);
}
