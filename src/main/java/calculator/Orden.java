package calculator;

public abstract class Orden implements Comando{
	private Calculator calculator;
	
	public Orden (Calculator calculator){
		this.calculator = calculator;
	}
	
	public Calculator getCalculator(){
		return this.calculator;
	}

}
