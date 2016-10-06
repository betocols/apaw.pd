package calculator;

import upm.jbb.IO;

public class AddCommand extends CalculatorCommand {
	private static String NAME = "addCommand"; 
	
	public AddCommand(Calculator calculator) {
		super(calculator, NAME);
	}
	
	@Override
	public void execute() {
		this.getCalculator().add(IO.getIO().readInt());
	}
}
