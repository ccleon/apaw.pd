package composite.expression;

public class Resta extends CompositeExpression{
	
	public Resta (Expression exp1, Expression exp2){
		super (exp1, exp2);
	}
	
	public int operar (){
		return (this.getExpression1().operar() - this.getExpression2().operar());
	}
	
	@Override
	public String toStringParcial(){
		return "-";
	}
}
