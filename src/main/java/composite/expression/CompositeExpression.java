package composite.expression;

public abstract class CompositeExpression extends Expression{
	private Expression exp1, exp2;
	
	public CompositeExpression (Expression exp1, Expression exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	@Override
	public abstract int operar();
	
	@Override
	public String toString(){
		return "("+ this.exp1.toString() + this.toStringParcial() + this.exp2.toString() + ")";
	}
	
	public Expression getExpression1(){
		return this.exp1;
	}
	
	public Expression getExpression2(){
		return this.exp2;
	}
	
	public abstract String toStringParcial();

}
