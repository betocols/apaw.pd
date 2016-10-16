package composite.expression;

public class Division extends ExpressionOperation{

    public Division(Expression expresion1, Expression expresion2) {
        super(expresion1, expresion2);
    }

    @Override
    public String toString() {
        return  "(" + leftArgument.toString() + "/" + rightArgument.toString() + ")" ;
    }

	@Override
	public int getResult(Expression leftArgument, Expression rightArgument) {
        return Math.round(leftArgument.operate() / rightArgument.operate()) ;
	}

}
