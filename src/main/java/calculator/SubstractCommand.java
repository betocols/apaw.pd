package calculator;

import upm.jbb.IO;

public class SubstractCommand extends CalculatorCommand {
	private static String NAME = "Substract";
	
	public SubstractCommand(Calculator calculator) {
		super(calculator, NAME);
	}
	
	@Override
	public void execute() {
		 this.getCalculator().subtract(IO.getIO().readInt());
	}

}
