package calculator;

import upm.jbb.IO;

public class PrintCommand extends Orden{
	
	public PrintCommand (Calculator calculator){
		super (calculator);
	}
	
	@Override
	public void execute() {
		IO.getIO().println(this.getCalculator().getTotal());
	}

	@Override
	public String name() {
		return "Print";
	}

	
	
}
