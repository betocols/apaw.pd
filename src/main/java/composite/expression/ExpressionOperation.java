
package composite.expression;



public abstract class ExpressionOperation extends Expression{
    protected String operacion;
    protected Expression leftArgument;
    protected Expression rightArgument;

    public ExpressionOperation(Expression leftArgument, Expression rightArgument){
    	this.leftArgument = leftArgument;
    	this.rightArgument = rightArgument;
    }
    
    public abstract int getResult(Expression leftArgument, Expression rightArgument);
    
	@Override
    public int operate() {
        return getResult(leftArgument, rightArgument);
    }

}
