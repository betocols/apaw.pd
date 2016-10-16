package composite.expression;

public class Resta extends ExpressionOperation{
	
    public Resta(Expression expresion1, Expression expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public String toString() {
        return  "(" + leftArgument.toString() + "-" + rightArgument.toString() + ")" ;
    }

	@Override
	public int getResult(Expression leftArgument, Expression rightArgument) {
        return leftArgument.operate() - rightArgument.operate();
	}

}
