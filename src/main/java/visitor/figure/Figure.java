package visitor.figure;

public abstract class Figure {

	protected String description;
	
    public Figure(String description) {
    	this.description = description;
    }
    
//    public abstract double area();
//    public abstract double numberOfSides();

    public abstract void accept(Visitor v);
}
