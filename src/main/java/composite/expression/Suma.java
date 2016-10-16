package composite.expression;


public class Suma extends ExpressionOperation{
	
    public Suma(Expression expresion1, Expression expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public String toString() {
        return  "(" + leftArgument.toString() + "+" + rightArgument.toString() + ")" ;
    }

	@Override
	public int getResult(Expression leftArgument, Expression rightArgument) {
        return leftArgument.operate() + rightArgument.operate();
	}

}
